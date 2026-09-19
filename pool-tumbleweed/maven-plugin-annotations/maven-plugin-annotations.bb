SUMMARY = "Maven Plugin Java 5 Annotations"
DESCRIPTION = "This package contains Java 5 annotations to use in Mojos."
LICENSE = "Apache-2.0"

PV = "4.0.0~beta3"

RPM_NAME = "maven-plugin-annotations-4.0.0~beta3-1.1.noarch.rpm"
RPM_HASH = "146e2c8d843c91c770d44ed9e0b6e3d130cdffd0157c2aac421d06de7d024d2e77fc0e4626caa4c0c047beeefd61a7e9ef2ec566dba0ddea148f02482aa9578c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
