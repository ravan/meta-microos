SUMMARY = "Javadoc documentation for jsr-305"
DESCRIPTION = "This package contains the API documentation for jsr-305."
LICENSE = "BSD-3-Clause"

PV = "3.0.2"

RPM_NAME = "jsr-305-javadoc-3.0.2-3.8.noarch.rpm"
RPM_HASH = "1a6d23984a6b95d74e90d106ad9543dbdd141000cdcec93334396fc3364305eacaebb0d38428e02e70648bc53dd21311195aa9bfb7dec013dd62bcc78ad58a2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsr-305-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
