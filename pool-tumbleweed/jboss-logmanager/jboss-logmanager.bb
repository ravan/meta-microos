SUMMARY = "JBoss Log Manager"
DESCRIPTION = "This package contains the JBoss Log Manager"
LICENSE = "Apache-2.0"

PV = "2.0.4"

RPM_NAME = "jboss-logmanager-2.0.4-3.17.noarch.rpm"
RPM_HASH = "fc7291fde11fd0b74aba19608cdf59bbec5a2ed033bb027648be00748b6a16655a9b517799c72be1d36191cf4f0d0f9c0fc7f680c41b501a75005f0c87da326c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logmanager \
mvn-org.jboss.logmanager-jboss-logmanager \
mvn-org.jboss.logmanager-jboss-logmanager-pom- \
osgi-org.jboss.logmanager.jboss-logmanager"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
