SUMMARY = "Binary files of pdftosrc"
DESCRIPTION = "Binary files of pdftosrc"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-pdftosrc-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "6d09ca41b8619b51759302743b90f2324e4949a88888e6f00680075ab83c9670f7692415663242cf05b9ced7076267e39de5b0ae5fc664fd2bbf56f356097c53"

RPROVIDES:${PN} += "texlive-pdftools-bin-/usr/bin/pdftosrc \
texlive-pdftosrc-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkpathsea.so.6 \
libm.so.6 \
libstdc++.so.6 \
texlive-pdftosrc"

inherit rpm
