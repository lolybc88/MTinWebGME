/**
 * More than one rule
 * Setting relationships: containments, pointers, etc.
 */

rule Class2Table {
	from
		c:Class ( c.isAbstract = false )
	to
		t:Table(
			nname <- c.nname
			key() <- if c.children() != null and c.children()->size()>0 then
						resolve(c.children()->first(), 1)
					 else
					 	null
					 endif
			children() <- c.children()->collect(a | resolve(a, 1))
		)
}

rule Attribute2Column {
	from
		a : Attribute ( a.parent().isAbstract = false )
	to
		col:Column(
			nname <- a.nname	
		)
	
}