SUMMARY = "Library for implementing USB device usage policy"
DESCRIPTION = "The USBGuard software framework helps to protect your computer against rogue USB \
devices by implementing basic whitelisting/blacklisting capabilities based on \
USB device attributes."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.4"

RPM_NAME = "libusbguard1-1.1.4-3.9.aarch64.rpm"
RPM_HASH = "8e48e207c6fffd81d745110e43298ef6cad2fd18f94c1aec6ae75a064ac106dac73e707af481c17fc510786f30669bb5960d79a2ddb062418cf25c5a0ab6a3aa"

RPROVIDES:${PN} += "libusbguard.so.1 \
libusbguard1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.36.1.0 \
libqb.so.100 \
libsodium.so.26 \
libstdc++.so.6 \
libutf8-range.so.36.1.0"

inherit rpm
