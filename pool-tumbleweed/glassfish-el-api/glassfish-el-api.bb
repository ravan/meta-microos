SUMMARY = "Expression Language 3.0 API"
DESCRIPTION = "Expression Language 3.0 API."
LICENSE = "Apache-2.0 & (CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "3.0.1~b08"

RPM_NAME = "glassfish-el-api-3.0.1~b08-3.8.noarch.rpm"
RPM_HASH = "41282343527cf10f548ac6a30135b98c86e9179f946373e77935edfc123e5b0601b44625e548ec3c862d4c0db41520c56042004a5f696ff51be0e9c0a59d21a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-el-api \
mvn-javax.el-el-api \
mvn-javax.el-el-api-pom- \
mvn-javax.el-javax.el-api \
mvn-javax.el-javax.el-api-pom- \
mvn-org.glassfish-javax.el-api \
mvn-org.glassfish-javax.el-api-pom- \
osgi-javax.el-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
