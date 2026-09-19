SUMMARY = "Binary files of luajittex"
DESCRIPTION = "Binary files of luajittex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn78022"

RPM_NAME = "texlive-luajittex-bin-2026.20260301.svn78022-120.4.aarch64.rpm"
RPM_HASH = "6a1004d4f5b649f07871f0706461e953850117a43b99e36d12e4a09d32dd30ca9e41742bb928af6e73d23083fedf232cb6af702cc50d9d3b5690bc5ec5ba05fb"

RPROVIDES:${PN} += "texlive-luajittex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libtexluajit.so.2 \
libz.so.1 \
libz1 \
libzzip.so.13 \
texlive-luajittex"

inherit rpm
