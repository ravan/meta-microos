SUMMARY = "Binary files of ptex"
DESCRIPTION = "Binary files of ptex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn78022"

RPM_NAME = "texlive-ptex-bin-2026.20260301.svn78022-120.4.aarch64.rpm"
RPM_HASH = "ca5bd31db08d4b72c0677f9258f33716f70f776aa88dad39ef69145fc70d93a63028d8bed8a723668b375f9e65a2dec2d69661e16faef626554b9729cbff1ee3"

RPROVIDES:${PN} += "texlive-ptex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgmp.so.10 \
libkpathsea.so.6 \
libm.so.6 \
libmpfr.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libptexenc.so.1 \
libz.so.1 \
texlive-ptex"

inherit rpm
