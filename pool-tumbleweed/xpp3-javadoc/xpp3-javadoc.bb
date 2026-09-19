SUMMARY = "XML Pull Parser"
DESCRIPTION = "Xml Pull Parser 3rd Edition (XPP3) MXP1 is a new XmlPull parsing engine \
that is based on ideas from XPP and in particular XPP2 but completely \
revised and rewritten to take best advantage of latest JIT JVMs such as \
Hotspot in JDK 1.4."
LICENSE = "Apache-1.1"

PV = "1.1.4c"

RPM_NAME = "xpp3-javadoc-1.1.4c-11.8.noarch.rpm"
RPM_HASH = "87b8511e198a98d7735e4f224bd45c8a1081ca5b278c6cdf674e99e689f761b4f079cdcb61a49fc40ab2aeb22aa35f9586b2667cc04fe61399f4a073a96c59c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xpp3-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
