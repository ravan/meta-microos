SUMMARY = "Javadocs for jnr-enxio"
DESCRIPTION = "This package contains the API documentation for jnr-enxio."
LICENSE = "Apache-2.0 & LGPL-3.0-only"

PV = "0.32.14"

RPM_NAME = "jnr-enxio-javadoc-0.32.14-2.10.noarch.rpm"
RPM_HASH = "36cafd7008647a4581cd0f4435340c69c961b50275982cfce3b6484f6146d017157079de4a306c43d3becc62c0d2c1d98b45a7a3ce80766069df71a96be1f9df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-enxio-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
