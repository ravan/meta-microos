SUMMARY = "Javadoc generated documentation for Apache Tomcat"
DESCRIPTION = "Javadoc generated documentation files for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.121"

RPM_NAME = "tomcat-javadoc-9.0.121-1.1.noarch.rpm"
RPM_HASH = "83963876c4e2cdbfc2ba6c50e0fd723ba7e0e311b8ab48e57f91a776d1016d5d58f7126f97f6a8521dc5b5ab2084148ca53f5e847f7789c1059d223e0fb0ddbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-implementation-javadoc \
tomcat-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
