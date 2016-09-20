 /**
 * Assignment: Not primitive type. Depending on the input element. 
 */

rule Class2Table {
	from
		c:Class
	to
		t:Table(
			nname <- c.nname
//			nname <- c.nname.concatenate('_table')
			doc <- 'this is a table'
		)
}