SUMMARY = "Maven Native Components"
DESCRIPTION = "Maven Native Components."
LICENSE = "Apache-2.0 & MIT"

PV = "1.0.0"

RPM_NAME = "maven-native-components-1.0.0-1.2.noarch.rpm"
RPM_HASH = "851c08c15c32752770f1e1590e3927ebbfdecdb7feae041ffc295a5a8a37269d9ad763b454c82b8cd3f7c6414bf6ea0a56029b6a60d914570688453742d3895b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-native-components \
mvn-org.codehaus.mojo.natives-maven-native-bcc \
mvn-org.codehaus.mojo.natives-maven-native-bcc-pom- \
mvn-org.codehaus.mojo.natives-maven-native-components-pom- \
mvn-org.codehaus.mojo.natives-maven-native-generic-c \
mvn-org.codehaus.mojo.natives-maven-native-generic-c-pom- \
mvn-org.codehaus.mojo.natives-maven-native-javah \
mvn-org.codehaus.mojo.natives-maven-native-javah-pom- \
mvn-org.codehaus.mojo.natives-maven-native-manager \
mvn-org.codehaus.mojo.natives-maven-native-manager-pom- \
mvn-org.codehaus.mojo.natives-maven-native-mingw \
mvn-org.codehaus.mojo.natives-maven-native-mingw-pom- \
mvn-org.codehaus.mojo.natives-maven-native-msvc \
mvn-org.codehaus.mojo.natives-maven-native-msvc-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.mojo.natives-maven-native-api \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
