SUMMARY = "POM-only artifacts for netty"
DESCRIPTION = "POM-only artifacts for netty."
LICENSE = "Apache-2.0"

PV = "4.1.136"

RPM_NAME = "netty-parent-4.1.136-1.1.noarch.rpm"
RPM_HASH = "9a067920904da44e88a4dbca89e94e2c7841bb2f1ed812111de87ed17d68e0bddf99343fe1fc00d1ba988d00dee6974f07f7870fd64365ac5038802e8af7b3fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.netty-netty-parent-pom- \
netty-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-kr.motd.maven-os-maven-plugin \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-remote-resources-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin \
mvn-org.codehaus.mojo-build-helper-maven-plugin"

inherit rpm
