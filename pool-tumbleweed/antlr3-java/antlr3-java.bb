SUMMARY = "Java run-time support for ANTLR-generated parsers"
DESCRIPTION = "Java run-time support for ANTLR-generated parsers"
LICENSE = "BSD-3-Clause"

PV = "3.5.3"

RPM_NAME = "antlr3-java-3.5.3-8.3.noarch.rpm"
RPM_HASH = "9ef206cb332ede15e4ea4b7e44b95d9435a2c31985050d7af9003025f5899e0075f933d0fc52426407abbd299763f855226564ce45f624eec03980253fcd37ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr3-java \
mvn-org.antlr-antlr-runtime \
mvn-org.antlr-antlr-runtime-pom- \
osgi-org.antlr.runtime"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
