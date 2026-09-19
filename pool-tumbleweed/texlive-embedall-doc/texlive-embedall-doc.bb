SUMMARY = "Documentation for texlive-embedall"
DESCRIPTION = "This package includes the documentation for texlive-embedall"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn51177"

RPM_NAME = "texlive-embedall-doc-2026.226.2.0svn51177-61.4.noarch.rpm"
RPM_HASH = "cf78b033d6b2deb3d331b913eaec312c458058e984db04c6f22d7accee5a5166300cb0305f118cf8a08b9856dce6bb8497f1a0d0e339bb2e26dc3a049652c3d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embedall-doc"

RDEPENDS:${PN} += ""

inherit rpm
