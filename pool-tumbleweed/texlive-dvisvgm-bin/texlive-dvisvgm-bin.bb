SUMMARY = "Binary files of dvisvgm"
DESCRIPTION = "Binary files of dvisvgm"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77966"

RPM_NAME = "texlive-dvisvgm-bin-2026.20260301.svn77966-120.4.aarch64.rpm"
RPM_HASH = "a3888ff09d1131ca4a87526301d9f1effbc2d1b23bfd9a67e6952b0b825fd5edd070355c5725155c61c2e38f05f0f726b7a297583308563d2dfadb55e4da4566"

RPROVIDES:${PN} += "texlive-dvisvgm-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgs.so.10 \
libkpathsea.so.6 \
libm.so.6 \
libpotrace.so.0 \
libstdc++.so.6 \
libz.so.1 \
texlive-dvisvgm"

inherit rpm
