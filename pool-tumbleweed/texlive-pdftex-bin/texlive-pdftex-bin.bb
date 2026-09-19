SUMMARY = "Binary files of pdftex"
DESCRIPTION = "Binary files of pdftex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn78082"

RPM_NAME = "texlive-pdftex-bin-2026.20260301.svn78082-120.4.aarch64.rpm"
RPM_HASH = "fa67fb9534cecba60695f70ee63706081fb09a4dffafb36de5e27d509770f6698e15e7e937e3facdae2a3349cc6645bceea0c3278a8cde02252b07999286cd73"

RPROVIDES:${PN} += "texlive-pdftex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
texlive-pdftex"

inherit rpm
