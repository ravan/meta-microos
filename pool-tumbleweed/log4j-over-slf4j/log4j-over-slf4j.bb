SUMMARY = "Log4j implemented over SLF4J"
DESCRIPTION = "Log4j implemented over SLF4J."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.18"

RPM_NAME = "log4j-over-slf4j-2.0.18-1.2.noarch.rpm"
RPM_HASH = "24a93bb2f8ad5ab2cebe3b142d3e886aa2b57239e42c5eb1cbb75896af3739ccbe48cb5fcb49502b0f3d88b616fb243290e88c3d6a43745778ffac4ab7327f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-over-slf4j \
mvn-org.slf4j-log4j-over-slf4j \
mvn-org.slf4j-log4j-over-slf4j-pom- \
osgi-log4j.over.slf4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
