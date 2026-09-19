SUMMARY = "LIRC driver library"
DESCRIPTION = "The LIRC driver library. To actually use the lirc plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.2"

RPM_NAME = "liblirc_driver0-0.10.2-2.5.aarch64.rpm"
RPM_HASH = "fd90ffaceaab9d4f079c41264778ed657b90b2f752e48a400805a2edd0639e2b3bac02da23ee67c62dfe7948449ce5b038b4dc197245019101d69f1c5d63dc49"

RPROVIDES:${PN} += "liblirc-driver.so.0 \
liblirc-driver0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblirc.so.0 \
libudev.so.1"

inherit rpm
