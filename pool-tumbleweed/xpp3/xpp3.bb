SUMMARY = "XML Pull Parser"
DESCRIPTION = "Xml Pull Parser 3rd Edition (XPP3) MXP1 is a new XmlPull parsing engine \
that is based on ideas from XPP and in particular XPP2 but completely \
revised and rewritten to take best advantage of latest JIT JVMs such as \
Hotspot in JDK 1.4."
LICENSE = "Apache-1.1"

PV = "1.1.4c"

RPM_NAME = "xpp3-1.1.4c-11.8.noarch.rpm"
RPM_HASH = "fe05bf45f4b877f0fa3f8fbb86a7d1276adfc0204d0a60ebcf7e345b40d28ad7cce8f50246e97fc885a2d701c058027b7087791e31c9331286f5f35563fab0b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-xpp3-xpp3 \
mvn-xpp3-xpp3-pom- \
mvn-xpp3-xpp3-xpath \
mvn-xpp3-xpp3-xpath-pom- \
osgi-org.xmlpull \
xpp3"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
