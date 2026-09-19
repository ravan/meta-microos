SUMMARY = "XPath implementation using JDOM"
DESCRIPTION = "werken.xpath is an implementation of the W3C XPath Recommendation, on \
top of the JDOM library.  It takes as input a XPath expression, and a \
JDOM tree, and returns a NodeSet (java.util.List) of selected \
elements.  Is is being used in the development of the \
as-yet-unreleased werken.xslt (eXtensible Stylesheet Language) and the \
werken.canonical (XML canonicalization) packages."
LICENSE = "Apache-1.1"

PV = "0.9.4"

RPM_NAME = "werken-xpath-0.9.4-29.9.noarch.rpm"
RPM_HASH = "9781376b7a0eeef26b50eeea07d3e9722d0a91a9025434c2c7dd8b5dc9b90ee975d00baad8c4db722dd7c84b7e1a724a2e9b053dfce5d01fac7d76f7767f7ca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-werken-xpath-werken-xpath \
mvn-werken-xpath-werken-xpath-pom- \
werken-xpath \
werken.xpath"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
jdom"

inherit rpm
