SUMMARY = "The ftp module for maven-wagon"
DESCRIPTION = "The ftp module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-ftp-3.5.3-2.9.noarch.rpm"
RPM_HASH = "c636c83939fe535b3af3ee4946ab3dc99a9c91ffeae799487f332aad02bb831172d6fa309b87848a74fde72304a3273997f6fb7652dcb212e25c31cbd2010c47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-ftp \
mvn-org.apache.maven.wagon-wagon-ftp \
mvn-org.apache.maven.wagon-wagon-ftp-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-commons-net-commons-net \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.slf4j-slf4j-api"

inherit rpm
