SUMMARY = "Native protocols library for iOS devices"
DESCRIPTION = "libimobiledevice is a software library that talks the protocols to support \
iOS devices. It does not depend on any existing libraries from Apple."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.0+0git.20251010"

RPM_NAME = "libimobiledevice-1_0-6-1.4.0+0git.20251010-1.6.aarch64.rpm"
RPM_HASH = "6274a701ad32392fe279dc4eaf04ef9a640f83db0c276175e1f8cfbe8bdbd4f6878d5f1046e709ac47064c64cd15fa030e0b6ce7308cc8edd2a17dd30a34f040"

RPROVIDES:${PN} += "libimobiledevice-1-0-6 \
libimobiledevice-1.0.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libimobiledevice-glue-1.0.so.0 \
libplist-2.0.so.4 \
libssl.so.3 \
libusbmuxd-2.0.so.7"

inherit rpm
