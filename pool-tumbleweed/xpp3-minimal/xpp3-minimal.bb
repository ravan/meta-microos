SUMMARY = "XML Pull Parser"
DESCRIPTION = "Xml Pull Parser 3rd Edition (XPP3) MXP1 is a new XmlPull parsing engine \
that is based on ideas from XPP and in particular XPP2 but completely \
revised and rewritten to take best advantage of latest JIT JVMs such as \
Hotspot in JDK 1.4."
LICENSE = "Apache-1.1"

PV = "1.1.4c"

RPM_NAME = "xpp3-minimal-1.1.4c-11.8.noarch.rpm"
RPM_HASH = "4192ea8f201ed4b93ca48dc8a51c9115de88f523f9546b8d43cae741520b7a710c9d4ad9c00d62f2e427c7092b39b1b859f1b8e90136290457c59941bd9cf87f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-xpp3-xpp3-min \
mvn-xpp3-xpp3-min-pom- \
xpp3-minimal"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
