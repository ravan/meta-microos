SUMMARY = "Binary files of uptex"
DESCRIPTION = "Binary files of uptex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn78022"

RPM_NAME = "texlive-uptex-bin-2026.20260301.svn78022-120.4.aarch64.rpm"
RPM_HASH = "3454dd08b81061426b3478dcc966a69398835ea8b3e61785902dd3ac3c3d141fc3d8903353502f5349909bb771424f81e644c8b40219adada170e9a94a29216c"

RPROVIDES:${PN} += "texlive-uptex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgmp.so.10 \
libkpathsea.so.6 \
libm.so.6 \
libmpfr.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libptexenc.so.1 \
libz.so.1 \
texlive-uptex"

inherit rpm
