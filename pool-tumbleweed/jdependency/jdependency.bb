SUMMARY = "An API to analyse class dependencies"
DESCRIPTION = "jdependency is library that helps analyzing class level \
dependencies, clashes and missing classes."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "jdependency-1.4-1.7.noarch.rpm"
RPM_HASH = "8ce558222b47a31702dda211b06282b89586ecf101579525e9b091bb858385454f53fb9095692e0dc0739a95040da88318d0f00931445d8c40a9db9d52895039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdependency \
mvn-org.vafer-jdependency \
mvn-org.vafer-jdependency-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-analysis \
mvn-org.ow2.asm-asm-commons \
mvn-org.ow2.asm-asm-tree \
mvn-org.ow2.asm-asm-util"

inherit rpm
