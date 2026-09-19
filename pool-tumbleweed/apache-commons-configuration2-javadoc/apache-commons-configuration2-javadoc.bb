SUMMARY = "Javadoc for apache-commons-configuration2"
DESCRIPTION = "This package contains javadoc for apache-commons-configuration2."
LICENSE = "Apache-2.0"

PV = "2.15.1"

RPM_NAME = "apache-commons-configuration2-javadoc-2.15.1-1.2.noarch.rpm"
RPM_HASH = "ec81187a26f67cfe68044aef904b0d11ee4b5ee0d8a4cb9acdaae7a272d98c555c9240ef9c81d09bcb3d004c572fe81a84c821ece5fc33a6565e4251b6a4f83e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-configuration2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
