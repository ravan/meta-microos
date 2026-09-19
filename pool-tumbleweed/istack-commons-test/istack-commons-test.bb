SUMMARY = "Istack-commons test"
DESCRIPTION = "This package contains istack-commons test."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-test-3.0.7-8.10.noarch.rpm"
RPM_HASH = "2505c295f6f18aea98a113964fad831f56238a4715d985a63104230194ed5086e289af40c9aef27301887c36fd7b01876d49bd72468e9b6067a0f5eb42afc9dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-test \
mvn-com.sun.istack-istack-commons-test \
mvn-com.sun.istack-istack-commons-test-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-dom4j-dom4j \
mvn-junit-junit \
mvn-org.apache.ant-ant-junit"

inherit rpm
