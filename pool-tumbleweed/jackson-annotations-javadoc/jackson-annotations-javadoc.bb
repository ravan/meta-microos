SUMMARY = "Javadoc for jackson-annotations"
DESCRIPTION = "This package contains API documentation for jackson-annotations."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-annotations-javadoc-2.18.9-1.2.noarch.rpm"
RPM_HASH = "c646c71ba22fdfdb5f24caa3fbc6422da54125543693f9c47297039347e417a3d626f6eecc72b2978e9d8d34a9049ca81a3cd456c941c795c8d5c32cc58fb109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-annotations-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
