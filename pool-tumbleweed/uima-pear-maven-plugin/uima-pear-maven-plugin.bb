SUMMARY = "Apache UIMA Maven Pear Plugin"
DESCRIPTION = "This is a maven plugin that produces a pear artifact."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "uima-pear-maven-plugin-3.5.0-6.1.noarch.rpm"
RPM_HASH = "837b33bd3911fdcd345924015afb04e5044d2da4b5989e9691b21123f64b344eda394452212c85737dfc9e4b0a6853a589a5cbc2e0801541d0c26998a47eab1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.uima-PearPackagingMavenPlugin \
mvn-org.apache.uima-PearPackagingMavenPlugin-pom- \
uima-pear-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.uima-uimaj-core"

inherit rpm
