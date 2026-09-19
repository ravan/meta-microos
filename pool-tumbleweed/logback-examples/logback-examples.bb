SUMMARY = "Logback Examples Module"
DESCRIPTION = "logback-examples module."
LICENSE = "EPL-1.0 | LGPL-2.1-or-later"

PV = "1.6.0"

RPM_NAME = "logback-examples-1.6.0-1.1.noarch.rpm"
RPM_HASH = "c80e1b3c23311109cf80a1f088ed6720aa286c664325518b6c6371443cc0b6bc02b4ea2bf715327890e91dee0b702dd53e74e7cc57c21b1cec066e51383c1f75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logback-examples \
mvn-ch.qos.logback-logback-examples \
mvn-ch.qos.logback-logback-examples-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
mvn-ch.qos.logback-logback-classic \
mvn-ch.qos.logback-logback-core \
mvn-ch.qos.reload4j-reload4j \
mvn-org.slf4j-slf4j-ext"

inherit rpm
