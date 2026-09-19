SUMMARY = "Binary files of metafont"
DESCRIPTION = "Binary files of metafont"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-metafont-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "a21d305916b6f0858ac8f90faccde3ad2496c70d434fd1d03627bf3e3ac4032f0e2a776c6370cbfe15f8a863319485f5d7a1968cfac0a6fb8bfdb88fe7c9e635"

RPROVIDES:${PN} += "texlive-metafont-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXt.so.6 \
libc.so.6 \
libkpathsea.so.6 \
texlive-metafont"

inherit rpm
