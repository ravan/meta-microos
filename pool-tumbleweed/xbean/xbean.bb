SUMMARY = "Java plugin based web server"
DESCRIPTION = "XBean is a plugin-based server analogous to Eclipse being a \
plugin-based IDE. XBean is able to discover, download and install \
server plugins from an Internet-based repository. Support for \
multiple IoC systems, support for running with no IoC system, JMX \
without JMX code, lifecycle and class loader management, and a Spring \
integration is included."
LICENSE = "Apache-2.0"

PV = "4.20"

RPM_NAME = "xbean-4.20-3.9.noarch.rpm"
RPM_HASH = "2a3195eeab86badc9c16455bff30ef1868983e2892da702774da69adf7a849555952d8997b431d5350de5838d776d715276c624a45431ea9bca828d60effc7a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.xbean-xbean-asm-util \
mvn-org.apache.xbean-xbean-asm-util-pom- \
mvn-org.apache.xbean-xbean-finder \
mvn-org.apache.xbean-xbean-finder-pom- \
mvn-org.apache.xbean-xbean-reflect \
mvn-org.apache.xbean-xbean-reflect-pom- \
osgi-org.apache.xbean.asm-util \
osgi-org.apache.xbean.finder \
osgi-org.apache.xbean.reflect \
xbean"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
