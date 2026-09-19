SUMMARY = "Glassfish Hundred Kilobytes Kernel"
DESCRIPTION = "HK2 for Hundred Kilobytes Kernel is an abstraction to \
a module subsystem coupled with a simple yet powerful \
component model to build server side software."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-2.5.0-11.6.noarch.rpm"
RPM_HASH = "87fdc25fa3d01de461d6bdc41578033d3f85156d4535ad733ab03415732bacc67daddeda497b0908b76466d39d23e2d087bc68f7db16548356ea39799d3b54e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2 \
mvn-org.glassfish.hk2-hk2-bom-pom- \
mvn-org.glassfish.hk2-hk2-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin"

inherit rpm
