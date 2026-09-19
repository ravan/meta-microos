SUMMARY = "XML Schema Object Model (XSOM)"
DESCRIPTION = "XML Schema Object Model (XSOM) is a Java library that allows applications to \
easily parse XML Schema documents and inspect information in them. It is \
expected to be useful for applications that need to take XML Schema as an \
input.  The library is a straight-forward implement of 'schema components' as \
defined in the XML Schema spec part 1.  Refer to this specification of how this \
object model works."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "0~20140925"

RPM_NAME = "xsom-0~20140925-6.6.noarch.rpm"
RPM_HASH = "8c39d3a309a2d312d48b1978248bb4b58044e582bf998216377fb454094b90fc4b2080169356ee0340ba713a44136ae42d91620d65e1725ac1ba4471569fe5d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.sun.xsom-xsom \
mvn-com.sun.xsom-xsom-pom- \
xsom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-relaxngDatatype-relaxngDatatype"

inherit rpm
