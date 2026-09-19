SUMMARY = "JCL 1.1.1 implemented over SLF4J"
DESCRIPTION = "JCL 1.1.1 implemented over SLF4J."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.18"

RPM_NAME = "jcl-over-slf4j-2.0.18-1.2.noarch.rpm"
RPM_HASH = "57cfdf304e54ea2eeab06cc74be56e5e03788a79d42b96dc6e4347f3dcbf9cbe4ab131476425d6d22f8232615fa0eb23a1011bd66441b6e89f14ebf19f2a0a73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcl-over-slf4j \
mvn-org.slf4j-jcl-over-slf4j \
mvn-org.slf4j-jcl-over-slf4j-pom- \
osgi-jcl.over.slf4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
