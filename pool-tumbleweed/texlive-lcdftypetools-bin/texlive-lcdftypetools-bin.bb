SUMMARY = "Binary files of lcdftypetools"
DESCRIPTION = "Binary files of lcdftypetools"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-lcdftypetools-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "3075100d5f3b8fa8d8d46a3666b924f87196424f7530af89850c5b73beff08b1aaad8ec3124ff5a4d0172e282d62f6aa52a5a018047da05f6a4449452bf1f4d9"

RPROVIDES:${PN} += "texlive-lcdftypetools-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkpathsea.so.6 \
libm.so.6 \
libstdc++.so.6 \
texlive-lcdftypetools"

inherit rpm
