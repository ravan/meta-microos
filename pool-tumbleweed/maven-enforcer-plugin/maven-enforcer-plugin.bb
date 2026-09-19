SUMMARY = "Enforcer Rules"
DESCRIPTION = "The Enforcer plugin provides goals to control certain environmental \
constraints such as Maven version, JDK version and OS family along \
with many more built-in rules and user created rules."
LICENSE = "Apache-2.0"

PV = "3.6.3"

RPM_NAME = "maven-enforcer-plugin-3.6.3-1.2.noarch.rpm"
RPM_HASH = "5b7b483a0ffcc639b4da5a0f170d7a9ec5ed03c57677e6d33ccc10ff922bba656555b1789a56cc09dc8e800fe4fbdc8f1cad6ed0bab9e237136b3608f97b1c57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer-plugin \
mvn-org.apache.maven.plugins-maven-enforcer-plugin \
mvn-org.apache.maven.plugins-maven-enforcer-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.enforcer-enforcer-api \
mvn-org.apache.maven.enforcer-enforcer-rules \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
