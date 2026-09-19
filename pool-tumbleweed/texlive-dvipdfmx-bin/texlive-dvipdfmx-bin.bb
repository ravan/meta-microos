SUMMARY = "Binary files of dvipdfmx"
DESCRIPTION = "Binary files of dvipdfmx"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77966"

RPM_NAME = "texlive-dvipdfmx-bin-2026.20260301.svn77966-120.4.aarch64.rpm"
RPM_HASH = "e17cc3b9133781c293283b3fafbd739f491307e35aa5dd5d1bb5d7b89d0aa71f11f5d2fc6e6d5df3b42a137d3e77dc1d0c33bf9098255fb9ed53569abc01f247"

RPROVIDES:${PN} += "texlive-dvipdfm-bin \
texlive-dvipdfmx-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
libpaper.so.2 \
libpng16.so.16 \
libz.so.1 \
texlive-dvipdfmx \
texlive-scripts \
texlive-xetex-bin"

inherit rpm
