SUMMARY = "Binary files of axodraw2"
DESCRIPTION = "Binary files of axodraw2"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-axodraw2-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "9b21c066a970546f8b19d8a98ba05c7d1a0a9569cf07ee5eb51f2a237b7ce2a1faf568d149f64a1c7f0ae1ae940014b455b9b9ecf7793cb8efca1c57a363d402"

RPROVIDES:${PN} += "texlive-axodraw2-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
texlive-axodraw2"

inherit rpm
