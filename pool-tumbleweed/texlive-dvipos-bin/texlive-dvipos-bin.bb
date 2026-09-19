SUMMARY = "Binary files of dvipos"
DESCRIPTION = "Binary files of dvipos"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-dvipos-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "c05e977efd7f663cbb9a99f9f687d9c771ed4b5dfe2c4ea10d677d453e52506c4019e277dfbffd15b20cd1f4f81a1bb744586123333d0fdc44536011a53cf042"

RPROVIDES:${PN} += "texlive-dvipos-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-dvipos"

inherit rpm
