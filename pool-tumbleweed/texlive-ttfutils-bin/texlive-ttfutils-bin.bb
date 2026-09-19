SUMMARY = "Binary files of ttfutils"
DESCRIPTION = "Binary files of ttfutils"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-ttfutils-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "d61d5e2e8bc90164408ccb640faa64bf2d83fc35a1fb2bd50476adf53ec714d07c2a4eef222a27be744a7021f2d877540a3ab0564cfcd1d601490cf9e9ab897e"

RPROVIDES:${PN} += "texlive-ttfutils-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-ttfutils"

inherit rpm
