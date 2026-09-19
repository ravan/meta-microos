SUMMARY = "Parent POM for Weld"
DESCRIPTION = "Parent POM for Weld"
LICENSE = "Apache-2.0"

PV = "34"

RPM_NAME = "weld-parent-34-1.18.noarch.rpm"
RPM_HASH = "d761291edb1e73cad25c17c5b9544d31b1293eea33888f5352a7edb6067c0694b6422ec48437ba0721459cf9b082bcd96d9441b987270aeeb6eebf0493b8fadd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jboss.weld-weld-parent-pom- \
weld-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-source-plugin \
mvn-org.codehaus.mojo-build-helper-maven-plugin"

inherit rpm
