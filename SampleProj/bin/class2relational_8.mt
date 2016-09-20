/**
 * More than one output element
 * Setting relationships: containments, pointers, etc.
 */

rule Class2Table {
	from
		c:Class
	to
		t:Table(
			nname <- c.nname
			
			/**  containment */
//			children() <- resolve(c, 2)
//			children() <- Class.allInstances()->collect(clazz| resolve(clazz, 2))

			/**  pointer */
//			key() <- resolve(c.super(), 1) // WRONG!
			key() <- if c.super()!=null then resolve(c.super(), 2) else null endif
		)
		a:Attribute(
			nname <- c.nname.concatenate(' derived')
			parent() <- resolve(c, 1)
		)
}