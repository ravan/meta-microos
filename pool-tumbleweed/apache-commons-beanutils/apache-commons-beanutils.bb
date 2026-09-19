SUMMARY = "Utility methods for accessing and modifying the properties of JavaBeans"
DESCRIPTION = "The scope of this package is to create a package of Java utility \
methods for accessing and modifying the properties of arbitrary \
JavaBeans.  No dependencies outside of the JDK are required, so the use \
of this package is very lightweight."
LICENSE = "Apache-2.0"

PV = "1.11.0"

RPM_NAME = "apache-commons-beanutils-1.11.0-3.6.noarch.rpm"
RPM_HASH = "f30a1fe50c57aa7a13cdfd3badbcc2b29082f7df01640cbefcf96596393caaf3f9690257b2434937770a0e9ba0d3fd78516c60df6bee3c271024a194cb3b5e14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-beanutils \
commons-beanutils \
jakarta-commons-beanutils \
mvn-commons-beanutils-commons-beanutils \
mvn-commons-beanutils-commons-beanutils-bean-collections \
mvn-commons-beanutils-commons-beanutils-bean-collections-pom- \
mvn-commons-beanutils-commons-beanutils-core \
mvn-commons-beanutils-commons-beanutils-core-pom- \
mvn-commons-beanutils-commons-beanutils-pom-"

RDEPENDS:${PN} += "commons-collections \
commons-logging \
java-headless \
javapackages-filesystem \
mvn-commons-collections-commons-collections \
mvn-commons-logging-commons-logging"

inherit rpm
