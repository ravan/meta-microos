SUMMARY = "HK2 JMX module"
DESCRIPTION = "Hundred Kilobytes Kernel JMX module."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-jmx-2.5.0-11.6.noarch.rpm"
RPM_HASH = "4ea6ab57cd276c7fdec9014cf3a9fc9570ee17835f24c7b09c003ceee37afde304f29eedd63e62db666292773db3e1bb65dfc47f1aaf8af4fe9e6b06df6a5d6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-jmx \
mvn-org.glassfish.hk2-hk2-jmx \
mvn-org.glassfish.hk2-hk2-jmx-pom- \
osgi-org.glassfish.hk2.jmx"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-utils \
mvn-org.glassfish.hk2-osgi-resource-locator"

inherit rpm
