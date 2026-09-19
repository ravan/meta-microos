SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6CoreAddons6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "2b51d1ff398535f48445e3e8b5c6fedc742e5cc9a9d29ef7b8f428250d41bc82e8eee9c0a618a9e5f76f73a872a6102ecdef1747e1ba29fc735f26cffb06c9cc"

RPROVIDES:${PN} += "libKF6CoreAddons.so.6 \
libKF6CoreAddons6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kcoreaddons \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmount.so.1 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
