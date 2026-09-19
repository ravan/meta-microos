SUMMARY = "Binary files of getmap"
DESCRIPTION = "Binary files of getmap"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn34971"

RPM_NAME = "texlive-getmap-bin-2026.20260301.svn34971-120.4.aarch64.rpm"
RPM_HASH = "89aefb3f65a449adf62771f082b145761874c4764467eb5b290e2e963d83c84fa88bbd9a79dab6c2c202048e30c68fab0006c4ab022a4f8955a0d8f16bd4b0ce"

RPROVIDES:${PN} += "texlive-getmap-bin"

RDEPENDS:${PN} += "texlive-getmap"

inherit rpm
