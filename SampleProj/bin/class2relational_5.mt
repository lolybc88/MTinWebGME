/**
 * Filters
 */

rule Class2Table {
	from
		c:Class ( c.isAbstract = false )
	to
		t:Table(
			nname <- c.nname
		)
}