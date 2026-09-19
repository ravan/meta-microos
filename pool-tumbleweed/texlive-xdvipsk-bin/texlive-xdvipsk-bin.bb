SUMMARY = "Binary files of xdvipsk"
DESCRIPTION = "Binary files of xdvipsk"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn78082"

RPM_NAME = "texlive-xdvipsk-bin-2026.20260301.svn78082-120.4.aarch64.rpm"
RPM_HASH = "148724f57b8dc28d2be970162a2f7397e5ade8e23f329368e4a81faae5e45811db3bf86836e4148a19b2b06a8c441ac5d588fd5ab2e6e3b75ee46a02ea7f3490"

RPROVIDES:${PN} += "texlive-xdvipsk-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtexlua53.so.5 \
libz.so.1 \
texlive-xdvipsk"

inherit rpm
