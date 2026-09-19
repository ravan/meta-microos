SUMMARY = "Javadocs for apache-commons-exec"
DESCRIPTION = "This package contains the API documentation for apache-commons-exec."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "apache-commons-exec-javadoc-1.6.0-1.3.noarch.rpm"
RPM_HASH = "dbfe0e5d069b25270ed0d44f78b24d6a928730353c9a99cd1e4af3b90e36ccefdce25e3d26d54bef0a341ebc4ecb326caf2070373b10a2915d20b5ec1bcd1f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-exec-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
