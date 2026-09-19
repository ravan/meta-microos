SUMMARY = "SIS-PM Control for Linux"
DESCRIPTION = "This projects adds support control for the GEMBIRD Silver Shield PM device to linux."
LICENSE = "GPL-2.0-only"

PV = "4.12"

RPM_NAME = "sispmctl-4.12-1.8.aarch64.rpm"
RPM_HASH = "72d32958909edac21bdf3a08465cbc1d22a6e6b5545835263f4af54be4e2c1df615fa26aa992412db7d456a2f87aaa139b2938e99a4648aed18e64cbbc914f06"

RPROVIDES:${PN} += "sispmctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsispmctl.so.0 \
libusb-0.1.so.4"

inherit rpm
