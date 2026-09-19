SUMMARY = "SLF4J BOM"
DESCRIPTION = "SLF4J project BOM"
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.18"

RPM_NAME = "slf4j-bom-2.0.18-1.2.noarch.rpm"
RPM_HASH = "10f72203a700360354589fada985c26c7e85fce7cbe848782d7e15490a4aebe7ac5eda64e37c7d4874ebfc1948c9d758b21ae210b4e1f226fa8917c629d7970b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-slf4j-bom-pom- \
slf4j-bom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
