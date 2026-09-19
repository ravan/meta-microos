SUMMARY = "Javadoc for jackson-jaxrs-providers"
DESCRIPTION = "This package contains API documentation for jackson-jaxrs-providers."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-jaxrs-providers-javadoc-2.18.9-1.1.noarch.rpm"
RPM_HASH = "37d4603774ce6fb0a91c954f36615677812366f012a3f4bac2d3b90f6d4cc3f19756a0e8a6ae27cda3725164089be218d74f448eae52173fe13c50cff02030f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
