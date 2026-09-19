SUMMARY = "Parent POM file for Apache projects"
DESCRIPTION = "This package contains the parent pom file for apache projects."
LICENSE = "Apache-2.0"

PV = "39"

RPM_NAME = "apache-parent-39-1.2.noarch.rpm"
RPM_HASH = "2a58527bb39689cb156885f985b43be7decad8caf125b0cabd6ece7a6e4cf076dbafb19d314ea9490c19da941f07a547d85e9a7e102e21591eab01e2a8f1211f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-parent \
mvn-org.apache-apache-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
