SUMMARY = "Calculation of Gröbner fans"
DESCRIPTION = "Gfan is a software package for computing Gröbner fans and tropical \
varieties. These are polyhedral fans associated to polynomial ideals."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "gfan-0.7-2.5.aarch64.rpm"
RPM_HASH = "a3fab9c1bc2d776ad3a1205bcfb66efe5de4dd8fc1ab167bc045e3dd7b3bcd9c4b2f1210ecca451902a1a5fc56a1b018846d9e85b6781c9fe3845e9098d52a39"

RPROVIDES:${PN} += "gfan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcddgmp.so.0 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
