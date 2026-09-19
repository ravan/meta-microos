SUMMARY = "A JSON StAX implementation"
DESCRIPTION = "Jettison is a collection of Java APIs (like STaX and DOM) which read \
and write JSON. This allows nearly transparent enablement of JSON based \
web services in services frameworks like CXF or XML serialization \
frameworks like XStream."
LICENSE = "Apache-2.0"

PV = "1.5.4"

RPM_NAME = "jettison-1.5.4-2.10.noarch.rpm"
RPM_HASH = "0dcdc625cf93c0a0365df7aa02364fa24524e6e278da16e4a9644da7539a36397bb51c2cfcf25996c3dbb629dbb9d12886171a25d2f096650d5dd16d98d1b388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jettison \
mvn-org.codehaus.jettison-jettison \
mvn-org.codehaus.jettison-jettison-pom- \
osgi-org.codehaus.jettison.jettison"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
