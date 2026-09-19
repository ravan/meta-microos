SUMMARY = "Binary files of metapost"
DESCRIPTION = "Binary files of metapost"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn78022"

RPM_NAME = "texlive-metapost-bin-2026.20260301.svn78022-120.4.aarch64.rpm"
RPM_HASH = "8bce3a53a927f299325636d7f522b81c97ffdc6403acf8a16ad0a4c9e217ed6e262288ddc00cbd5d05b48a77b9312c580faa1ae947deb0e310df639d7ad0d4b0"

RPROVIDES:${PN} += "texlive-metapost-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgmp.so.10 \
libkpathsea.so.6 \
libm.so.6 \
libmpfr.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libz.so.1 \
texlive-metapost"

inherit rpm
