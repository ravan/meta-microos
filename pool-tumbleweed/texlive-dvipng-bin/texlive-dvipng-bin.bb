SUMMARY = "Binary files of dvipng"
DESCRIPTION = "Binary files of dvipng"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77966"

RPM_NAME = "texlive-dvipng-bin-2026.20260301.svn77966-120.4.aarch64.rpm"
RPM_HASH = "a1c5b34cc455157be03ed570cc0431d6983dab7bfcb65892b5d23406015a554a42e182e61982850f808e556d2c3f9ac710debb191bbd0474736ebdf36994734f"

RPROVIDES:${PN} += "texlive-dvipng-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgd.so.3 \
libkpathsea.so.6 \
libm.so.6 \
texlive-dvipng"

inherit rpm
