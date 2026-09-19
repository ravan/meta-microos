SUMMARY = "A build rule execution framework"
DESCRIPTION = "Enforcer is a build rule execution framework."
LICENSE = "Apache-2.0"

PV = "3.6.3"

RPM_NAME = "maven-enforcer-3.6.3-1.2.noarch.rpm"
RPM_HASH = "db01c6395db803113997d7df539b40cdf0749bedc93748a5b22a147e190fba48eda125ff5669190d2fc78599f23bfa02c546a7444557eb122f7d9ade99616d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer \
mvn-org.apache.maven.enforcer-enforcer-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-parent-pom-"

inherit rpm
