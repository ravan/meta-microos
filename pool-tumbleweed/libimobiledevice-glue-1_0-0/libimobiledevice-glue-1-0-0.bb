SUMMARY = "Native protocols library for iOS devices"
DESCRIPTION = "A library with common code used by libraries and tools around the libimobiledevice project. \
It does not depend on any existing libraries from Apple."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.2+git0.20250604"

RPM_NAME = "libimobiledevice-glue-1_0-0-1.3.2+git0.20250604-1.5.aarch64.rpm"
RPM_HASH = "e5ab85591851eefefee6c2639c3b95ef4b2886fe4f2c3208c37543ac80359c884097e5bf9b5511a29b78034125c283d0cf5c19e3a18e98a30614d98afaa2da57"

RPROVIDES:${PN} += "libimobiledevice-glue-1-0-0 \
libimobiledevice-glue-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libplist-2.0.so.4"

inherit rpm
