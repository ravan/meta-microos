SUMMARY = "Javadoc for jboss-jdk-misc"
DESCRIPTION = "This package contains the API documentation for jboss-jdk-misc."
LICENSE = "Apache-2.0"

PV = "3"

RPM_NAME = "jboss-jdk-misc-javadoc-3-1.6.noarch.rpm"
RPM_HASH = "24104cdbce68ce32dee6f89d0e3a15d542736bbb8344b3a5ff387e93bd208184457af6e5c09c4d1ba65926c2363c207ffb1f6804a960d8c41d3043a1e098e858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-jdk-misc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
