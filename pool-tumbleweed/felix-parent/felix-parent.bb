SUMMARY = "Parent POM file for Apache Felix Specs"
DESCRIPTION = "Parent POM file for Apache Felix Specs."
LICENSE = "Apache-2.0"

PV = "8"

RPM_NAME = "felix-parent-8-1.6.noarch.rpm"
RPM_HASH = "9d6a8e6f9f08e947a56c5aef5de7007db7935755de8ee4ca484672f4479c91e67c528e3503e42db664fab2babc68b61fb3c9efc0dd029e2d24ec1de5a23ea96e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-parent \
mvn-org.apache.felix-felix-parent-pom- \
mvn-org.apache.felix-felix-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache-apache-pom-"

inherit rpm
