/**
 * Simplest transformation
 * Only 1 rule, 1 input pattern and 1 output pattern
 * No filter. No assignments
 */

rule Class2Table {
	from
		c:Class
	to
		t:Table ( )
}