SUMMARY = "API documentation for google-gson"
DESCRIPTION = "This package contains the API documentation for google-gson."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "google-gson-javadoc-2.14.0-1.1.noarch.rpm"
RPM_HASH = "274fe8f949ba6bce7bca339597318c479cbba79ae1da87a6b82ed76e68cd52755cffd4c06f3261676d4c5baa7d52cd2a18dca669e035c170117f87c61b51790e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-gson-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
