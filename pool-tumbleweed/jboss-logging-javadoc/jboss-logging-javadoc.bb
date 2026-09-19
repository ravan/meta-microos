SUMMARY = "Javadoc for jboss-logging"
DESCRIPTION = "This package contains the API documentation for jboss-logging."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "jboss-logging-javadoc-3.4.1-4.17.noarch.rpm"
RPM_HASH = "61c220d1d497023958367271115dded8150c2399510cd09fee69e873abfc261f2c3f26a84e9d281c0cf4d3870ad97e944fe8e22dd430c6ec80d9150ca5b3a497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logging-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
