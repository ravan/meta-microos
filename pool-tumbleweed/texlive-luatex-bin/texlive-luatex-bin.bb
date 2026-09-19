SUMMARY = "Binary files of luatex"
DESCRIPTION = "Binary files of luatex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn78022"

RPM_NAME = "texlive-luatex-bin-2026.20260301.svn78022-120.4.aarch64.rpm"
RPM_HASH = "a356a0a6786bbd9bb37c5a7d5c7b7f27405b33fcf57968125af66669cfa20bde5ca602ab40c5d999c0e6336ba90640b14c41d2cb6c49075f97b84cad653d0710"

RPROVIDES:${PN} += "texlive-luatex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libtexlua53.so.5 \
libz.so.1 \
libz1 \
libzzip.so.13 \
texlive-luatex"

inherit rpm
