SUMMARY = "Parent POM for xstream"
DESCRIPTION = "Parent POM for xstream."
LICENSE = "BSD-3-Clause"

PV = "1.4.21"

RPM_NAME = "xstream-parent-1.4.21-1.6.noarch.rpm"
RPM_HASH = "6446cfeaa4b825fa67bc49c0c13a7fa2136dc6bfb7e2e5ff6dffe714e0adc12374520322892e95adf35b0730f62cfd86a5b4781513153903ffc8f32a9a4c8c34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.xstream-xstream-parent-pom- \
xstream-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.mojo-build-helper-maven-plugin \
xstream"

inherit rpm
