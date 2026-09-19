SUMMARY = "Stubbed versions of 'sun.misc' JDK packages"
DESCRIPTION = "Stubbed versions of 'sun.misc' JDK packages for certain library builds."
LICENSE = "Apache-2.0"

PV = "3"

RPM_NAME = "jboss-jdk-misc-3-1.6.noarch.rpm"
RPM_HASH = "4be610b7cf1d924ff9c888234716c067eabf7ad0ed84142c2ed38171e2e7dfe5933205732796d454fe2925a1116103f093920311664e2dbe1c442f445c93dd1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-jdk-misc \
mvn-org.jboss-jdk-misc \
mvn-org.jboss-jdk-misc-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
