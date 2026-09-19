SUMMARY = "Master POM for Glassfish Maven projects"
DESCRIPTION = "This is a shared POM parent for Glassfish Maven projects."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "8"

RPM_NAME = "glassfish-master-pom-8-1.18.noarch.rpm"
RPM_HASH = "1701219dbc5a49838c3a095c8c77cceb0cb4c4d1ef8c85162ada20517dd68c1595b0bc535b60827666022a5dcdc6a31c4f3114b6575f04a02118177f9bf379bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-master-pom \
mvn-org.glassfish-pom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-compiler-plugin"

inherit rpm
