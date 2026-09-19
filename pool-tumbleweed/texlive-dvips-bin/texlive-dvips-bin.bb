SUMMARY = "Binary files of dvips"
DESCRIPTION = "Binary files of dvips"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-dvips-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "83e485eebb62d59754dad2951ca4343b0a18592e231b1f8705ac9b74d16e378b29ea8905c2aa2ff3f46c60a17be4edad375905829443e2e742a2d93cd054337c"

RPROVIDES:${PN} += "texlive-dvips-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-dvips"

inherit rpm
