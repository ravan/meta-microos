SUMMARY = "Functionality for implementing interfaces and abstract types dynamically"
DESCRIPTION = "Mr Bean is an extension that implements support for 'POJO type materialization' \
ability for databinder to construct implementation classes for Java interfaces \
and abstract classes, as part of deserialization."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-module-mrbean-2.18.9-1.1.noarch.rpm"
RPM_HASH = "4b47c752b626c1bcaab4d79cb794a8eda0023cd63b38fdb4168c8be568fa25dbdce7dd5c9a416fccbf34c363b4a8908b7a19c3141276be44f0c5eb999c781852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-mrbean \
mvn-com.fasterxml.jackson.module-jackson-module-mrbean \
mvn-com.fasterxml.jackson.module-jackson-module-mrbean-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-mrbean"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-org.ow2.asm-asm"

inherit rpm
