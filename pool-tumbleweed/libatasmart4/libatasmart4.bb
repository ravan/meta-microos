SUMMARY = "ATA S.M.A.R.T. Disk Health Monitoring Library"
DESCRIPTION = "A small and lightweight parser library for ATA S.M.A.R.T. hard disk \
health monitoring."
LICENSE = "LGPL-2.1-or-later"

PV = "0.19"

RPM_NAME = "libatasmart4-0.19-11.9.aarch64.rpm"
RPM_HASH = "b252d8605a21f47dfe86be4fa7cc49deee61e25cdfee2aa6b884a906004c8aaf7ef3d75f263d4d6988eb4f1d788e28d00b06b00f699a80c8ed74a2389ccf7bcf"

RPROVIDES:${PN} += "libatasmart.so.4 \
libatasmart4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1"

inherit rpm
