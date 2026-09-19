SUMMARY = "Java API for handling Windows ini file format"
DESCRIPTION = "The [ini4j] is a simple Java API for handling configuration files in \
Windows .ini format. Additionally, the library includes Java \
Preferences API implementation based on the .ini file."
LICENSE = "Apache-2.0"

PV = "0.5.4"

RPM_NAME = "ini4j-0.5.4-1.9.noarch.rpm"
RPM_HASH = "275a3f9bc2960325c71dadcb11a8b035570c88bc55cdd22341c0285bcd74232f4b4920fbf205252bc48b62fce67ba1bc599361cc8a31f7a7ebed0a8592c0cc06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ini4j \
mvn-org.ini4j-ini4j \
mvn-org.ini4j-ini4j-pom-"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
