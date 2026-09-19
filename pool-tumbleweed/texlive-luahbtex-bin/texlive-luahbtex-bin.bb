SUMMARY = "Binary files of luahbtex"
DESCRIPTION = "Binary files of luahbtex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn78022"

RPM_NAME = "texlive-luahbtex-bin-2026.20260301.svn78022-120.4.aarch64.rpm"
RPM_HASH = "1d33ef8ffd9128755f79c58795983db9d32d5ecbc2e1ea877ea46091132c06ba0c6a72500c897225366e723d957428126ae389c656fd64f0dd25e3663a8b6e0e"

RPROVIDES:${PN} += "texlive-luahbtex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libtexlua53.so.5 \
libz.so.1 \
libz1 \
libzzip.so.13 \
texlive-luahbtex"

inherit rpm
