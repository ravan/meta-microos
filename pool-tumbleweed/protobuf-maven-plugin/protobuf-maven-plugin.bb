SUMMARY = "Maven Protocol Buffers Plugin"
DESCRIPTION = "A plugin that integrates protocol buffers compiler (protoc) into \
Maven lifecycle. This is a continuation of maven-protoc-plugin that \
was started at Google and later developed by GitHub community."
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "protobuf-maven-plugin-0.6.1-1.6.noarch.rpm"
RPM_HASH = "bf2fe42cb41ca10e530ab125f4692b9fe71f7f9fe002538fc797b69c85c9b6087402979b425c69b9ac13048ed940229b31d0d9d5b198402a1d73e53d436ce3d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.xolstice.maven.plugins-protobuf-maven-plugin \
mvn-org.xolstice.maven.plugins-protobuf-maven-plugin-pom- \
protobuf-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
