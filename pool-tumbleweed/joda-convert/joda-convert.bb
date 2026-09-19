SUMMARY = "Java library for conversion to and from standard string formats"
DESCRIPTION = "Java library to enable conversion to and from standard string formats."
LICENSE = "Apache-2.0"

PV = "2.2.3"

RPM_NAME = "joda-convert-2.2.3-2.8.noarch.rpm"
RPM_HASH = "4a8ff9dcf550f6f254783760bb786f8179884eddafaba61e55a9c1a77b5e0237da574b854cb3bb542e7a20763d2e5febb82ab6954d0cacb9b133a5fec065f452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joda-convert \
mvn-org.joda-joda-convert \
mvn-org.joda-joda-convert-pom- \
osgi-org.joda.convert"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
