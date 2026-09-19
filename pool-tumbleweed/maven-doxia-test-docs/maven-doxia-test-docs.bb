SUMMARY = "Test-docs module for maven-doxia"
DESCRIPTION = "This package provides Test-docs module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "maven-doxia-test-docs-2.1.0-1.3.noarch.rpm"
RPM_HASH = "a40683505fac229a8f4fb8d7069242f6bcfc179eafffc5d4ccff1fc44ce7622aea1a6dad95ed0353168786ef4a38b19fbfb7bd4fcc940bdcebb9d4d30f3269da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-test-docs \
mvn-org.apache.maven.doxia-doxia-test-docs \
mvn-org.apache.maven.doxia-doxia-test-docs-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
