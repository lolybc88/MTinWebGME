/**
 * Assignment: Navigating the input model 
 */

rule Class2Table {
	from
		c:Class ( c.isAbstract = false )
	to
		t:Table(
//			nname <- c.children()->first().nname // Might fail if the class doesn't have children()
//			nname <- if c.children() != null and c.children()->size()>0 then c.children()->first().nname else 'no children' endif
			
//			nname <- if c.parent() != null then c.parent().name else 'no parent' endif
			
			nname <- if c.super() != null then c.super().nname else 'no super' endif
		)
}