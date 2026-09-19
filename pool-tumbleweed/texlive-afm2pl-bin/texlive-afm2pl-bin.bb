SUMMARY = "Binary files of afm2pl"
DESCRIPTION = "Binary files of afm2pl"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-afm2pl-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "94bff9f0072bf1f2fb9fda7e2395ecfc57c88da73d34cd8086e0e10f922932ae06cbcbe55d960c7d73c2c7089564406ff91fb7a9ab3f361f9d6ded6ab8618633"

RPROVIDES:${PN} += "texlive-afm2pl-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-afm2pl"

inherit rpm
