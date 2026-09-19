SUMMARY = "Apache HttpAsyncClient Parent POM"
DESCRIPTION = "Apache HttpAsyncClient Parent POM."
LICENSE = "Apache-2.0"

PV = "4.1.4"

RPM_NAME = "httpcomponents-asyncclient-parent-4.1.4-5.4.noarch.rpm"
RPM_HASH = "4708ac82fd92cba3ff3a44c4d486c79b640e2a68eb1f585b1f4309c805ab26f665ad11c980b04f98bb5b846510747d402c25a9202a02e8933c79ee1623356002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-asyncclient-parent \
mvn-org.apache.httpcomponents-httpcomponents-asyncclient-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.httpcomponents-project-pom- \
mvn-org.apache.maven.plugins-maven-jar-plugin"

inherit rpm
