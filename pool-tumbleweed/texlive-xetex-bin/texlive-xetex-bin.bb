SUMMARY = "Binary files of xetex"
DESCRIPTION = "Binary files of xetex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77966"

RPM_NAME = "texlive-xetex-bin-2026.20260301.svn77966-120.4.aarch64.rpm"
RPM_HASH = "18790b684e7b52320c8ac5ccfcd9e4eef0afde803f7cd9df4a681942254f434afa6a5fca9ca05b78fc8f92dd7e6d8700f7e95aa8542a514afa1c7a683036ae1a"

RPROVIDES:${PN} += "texlive-xetex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgraphite2.so.3 \
libharfbuzz.so.0 \
libicuuc.so.78 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
texlive-xetex"

inherit rpm
