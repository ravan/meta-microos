SUMMARY = "Binary files of dvidvi"
DESCRIPTION = "Binary files of dvidvi"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-dvidvi-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "5d3818d147d714758a3d22cd471789ad6eebaf2a9ee058479b7c4dc6deedb8e4f0d673c3d629c20bb8a6f858378ad587d79d8cac5daa1468771afdce6bdc8de0"

RPROVIDES:${PN} += "texlive-dvidvi-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-dvidvi"

inherit rpm
