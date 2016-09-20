/**
 * Collections. Returning boolean values vs. returning elements
 * 
 * exists and forAll: return true or false depending on whether
 * 	all the elements (forAll) or
 * 	at least one element (exists)
 * fulfil the filter
 * 
 * select and collect:
 * 	select returns all the elements in the collection that fulfil the filter
 * 	collect returns all the elements specified in its body
 * 
 */

rule Class2Table {
	from
		c:Class ( c.isAbstract = false )
	to
		t:Table(
//			nname <- Class.allInstances()->exists(c | c.nname='Car' ).toString()
			nname <- Class.allInstances()->forAll(c | c.nname='Car' ).toString()			
//			
//			nname <- Class.allInstances()->select(c | c.isAbstract=false )->first().nname
//			nname <- Class.allInstances()->collect(c | c.children()->size() )->first()
		)
}