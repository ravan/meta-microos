SUMMARY = "Native Maven Plugin"
DESCRIPTION = "Native Maven Plugin."
LICENSE = "Apache-2.0 & MIT"

PV = "1.0.0"

RPM_NAME = "native-maven-plugin-1.0.0-1.2.noarch.rpm"
RPM_HASH = "53fde885be742ce80edcabb866a0cf95333681969a58e687315f726d86c4f835fe6e890e03232826bc66300bb6e26f644539719b3dc7f9f5dd6438ed15f6541c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.mojo-native-maven-plugin \
mvn-org.codehaus.mojo-native-maven-plugin-pom- \
native-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.bcel-bcel \
mvn-org.apache.maven-maven-aether-provider \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.mojo.natives-maven-native-api \
mvn-org.codehaus.mojo.natives-maven-native-bcc \
mvn-org.codehaus.mojo.natives-maven-native-generic-c \
mvn-org.codehaus.mojo.natives-maven-native-javah \
mvn-org.codehaus.mojo.natives-maven-native-manager \
mvn-org.codehaus.mojo.natives-maven-native-mingw \
mvn-org.codehaus.mojo.natives-maven-native-msvc \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
