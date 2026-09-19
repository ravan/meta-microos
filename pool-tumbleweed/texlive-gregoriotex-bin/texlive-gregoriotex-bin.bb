SUMMARY = "Binary files of gregoriotex"
DESCRIPTION = "Binary files of gregoriotex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-gregoriotex-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "0470ca9d395c955188e8deca8f791740cdc9d9792decf3e9438cd1b437f5469b6f1532d99033a9c5c45ed827807822638a4b27649174067fba92c7593df3fabb"

RPROVIDES:${PN} += "texlive-gregoriotex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-gregoriotex"

inherit rpm
