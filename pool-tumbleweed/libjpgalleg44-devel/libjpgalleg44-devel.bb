SUMMARY = "Development files for JPGAlleg"
DESCRIPTION = "This package is needed to build programs that use JPGAlleg."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "libjpgalleg44-devel-4.4.3.1-1.29.aarch64.rpm"
RPM_HASH = "39d6d3620912cfc93a8357ae776e40737b976740de704a4ba6dde64869abacfc749d62c90ed2d776a4507c2cdf3fd81e674a545e7a99d59de6e860b0f9fedd7f"

RPROVIDES:${PN} += "libjpgalleg-devel \
libjpgalleg44-devel \
pkgconfig-jpgalleg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpgalleg4-4 \
pkgconfig-allegro"

inherit rpm
