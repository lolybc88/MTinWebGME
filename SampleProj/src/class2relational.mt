rule Name{
	from
		c:Class
//		att:DataType ( not ( c.nname!='Car' and c.nname!='Car2' ) )
//					 ( c.nname='Car' and c.nname='Car2'  )
//					 ( c.nname!='Car' and c.nname!='Car2'  )
	to
		t:Table(
//			nname <- 'hello'
//			nname <- 3
//			nname <- 4.5
//			nname <- false
//			nname <- 7 + 2 * 4
			nname <- c.nname
//			nname <- c.parentt().name
//			nname <- c.children() ->first().name
//			nname <- Class.allInstances()->intersection(Attribute.allInstances())->union(3).toString()
//			nname <- Class.allInstances()->select(c | c.nname='Car' ).toString()
//			nname <- Class.allInstances()->exists(c | c.nname='Car' ).toString()
//			nname <- Class.allInstances()->forAll(c | c.nname='Car' ).toString()
//			nname <- if c.super() != null then c.super().nname else 'no super' endif
//			nname <- if not ( Class.allInstances()->exists(c | c.nname='Car' ) ) then c.super().nname else 'no super' endif
//			nname <- c.nname.concatenate(' copy')
//			
//			key() <- resolve(c.super(), 1)
//			key() <- if c.super()!=null then resolve(c.super(), 1) else null endif
			children() <- resolve(c, 2)
//			children() <- Class.allInstances()->collect(clazz| resolve(clazz, 2))
		)
		t1:Column (
			nname <- c.nname + '_column'
//			parent() <- resolve(c, 1)
		)
}