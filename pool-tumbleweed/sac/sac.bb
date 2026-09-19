SUMMARY = "Java standard interface for CSS parser"
DESCRIPTION = "SAC is a standard interface for CSS parsers, intended to work with CSS1, CSS2, \
CSS3 and other CSS derived languages."
LICENSE = "W3C"

PV = "1.3"

RPM_NAME = "sac-1.3-15.6.noarch.rpm"
RPM_HASH = "1f50c37c5fe03cc0e10a8916fa4eb8c851dd38753703c442ee51bad845653644c13431c914d4b28b2aa83be1248f2211b455d52df896f98bed71b63b2c8bb538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.w3c.css-sac \
mvn-org.w3c.css-sac-pom- \
osgi-org.w3c.css.sac \
sac"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
