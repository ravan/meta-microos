SUMMARY = "Javadoc for werken-xpath"
DESCRIPTION = "werken.xpath is an implementation of the W3C XPath Recommendation, on \
top of the JDOM library.  It takes as input a XPath expression, and a \
JDOM tree, and returns a NodeSet (java.util.List) of selected \
elements.  Is is being used in the development of the \
as-yet-unreleased werken.xslt (eXtensible Stylesheet Language) and the \
werken.canonical (XML canonicalization) packages."
LICENSE = "Apache-1.1"

PV = "0.9.4"

RPM_NAME = "werken-xpath-javadoc-0.9.4-29.9.noarch.rpm"
RPM_HASH = "f66611c6820914730ed1f7d2710c22e230a79444e3a9da856f47be202b47b033a5ce71058d23012e40b9268e3f9efbe421437168d82941458f736999a45b34dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "werken-xpath-javadoc \
werken.xpath-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
