SUMMARY = "SLF4J Migrator"
DESCRIPTION = "SLF4J Migrator."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.18"

RPM_NAME = "slf4j-migrator-2.0.18-1.2.noarch.rpm"
RPM_HASH = "8009ea27c7488c088b2e88b949e719fb8cd56b7d7a0155c84c886960e292dae5fd53eab8c866289513422249bdde6c2e6592c3f788a22e2d0ff324600008b5b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-slf4j-migrator \
mvn-org.slf4j-slf4j-migrator-pom- \
osgi-slf4j.migrator \
slf4j-migrator"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
