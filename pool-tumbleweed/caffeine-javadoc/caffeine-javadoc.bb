SUMMARY = "Javadoc for caffeine"
DESCRIPTION = "This package contains the API documentation for caffeine."
LICENSE = "Apache-2.0"

PV = "2.9.3"

RPM_NAME = "caffeine-javadoc-2.9.3-2.5.noarch.rpm"
RPM_HASH = "21c35b1b924c118d74b845d10c0b5cfc46c6de5b2f09b87868e57cd92d4e739428520c33aa1ef4d2f52f52813a61aa2f7a917fb81cab4603224bb4570ce6ed13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caffeine-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
