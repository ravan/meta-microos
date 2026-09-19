SUMMARY = "Libraries for sispmctl"
DESCRIPTION = "Libraries for the GEMBIRD Silver Shield PM device."
LICENSE = "GPL-2.0-only"

PV = "4.12"

RPM_NAME = "libsispmctl0-4.12-1.8.aarch64.rpm"
RPM_HASH = "cc46e83e7171edf9822d2fe29c269ecc47530e2c438aa379fdd985cbdee5551421b5432096195b81f6450c7ef8b7370af57448a52be537ca87c8936fc8058698"

RPROVIDES:${PN} += "libsispmctl.so.0 \
libsispmctl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4"

inherit rpm
