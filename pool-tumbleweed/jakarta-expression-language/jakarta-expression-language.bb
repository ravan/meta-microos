SUMMARY = "Jakarta Expression Language"
DESCRIPTION = "Jakarta Expression Language defines an expression language for Java applications."
LICENSE = "EPL-2.0"

PV = "6.0.1"

RPM_NAME = "jakarta-expression-language-6.0.1-2.6.noarch.rpm"
RPM_HASH = "75851fc860153dc59923226c0321f2b1d570bcff1a72f0dc1f31176e173ac37f752b0f76560eb2e2af91138bed7a4476dd4d88edcfb05d15782c02215965a806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-expression-language \
mvn-jakarta.el-jakarta.el-api \
mvn-jakarta.el-jakarta.el-api-pom- \
osgi-jakarta.el-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
