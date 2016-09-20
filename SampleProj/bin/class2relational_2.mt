/**
 * Assignment: Primitive type (String, Integer, Double, Boolean)
 */

rule Class2Table {
	from
		c:Class
	to
		t:Table(
			nname <- 'Table 1'
		)
}