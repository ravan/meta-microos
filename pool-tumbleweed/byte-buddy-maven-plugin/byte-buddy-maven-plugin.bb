SUMMARY = "Byte Buddy Maven plugin"
DESCRIPTION = "A plugin for post-processing class files via Byte Buddy in a Maven build."
LICENSE = "Apache-2.0"

PV = "1.18.8"

RPM_NAME = "byte-buddy-maven-plugin-1.18.8-1.2.noarch.rpm"
RPM_HASH = "16353c94a2bc0da632fcfe2a8441d29e392faebe8d18d7fe84c4542101b25dc54acf1b7614a13897c696655cc8a3618f29ab5fb88d63eb289c2ba118ba443c8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "byte-buddy-maven-plugin \
mvn-net.bytebuddy-byte-buddy-maven-plugin \
mvn-net.bytebuddy-byte-buddy-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.bytebuddy-byte-buddy \
mvn-org.eclipse.aether-aether-api \
mvn-org.eclipse.aether-aether-util \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
