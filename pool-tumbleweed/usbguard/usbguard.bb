SUMMARY = "A tool for implementing USB device usage policy"
DESCRIPTION = "The USBGuard software framework helps to protect your computer against rogue USB \
devices by implementing basic whitelisting/blacklisting capabilities based on \
USB device attributes."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.4"

RPM_NAME = "usbguard-1.1.4-3.9.aarch64.rpm"
RPM_HASH = "e566c1d47d4f7767f97777c0e68b697da8bf744a035eda3f47e1944d3ad2025f7cf80d6696ac89ffadba57b88d0ee8a835ab14ed87e78e1e0a26da7f6e53bd8b"

RPROVIDES:${PN} += "config-usbguard \
usbguard"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0 \
libseccomp.so.2 \
libstdc++.so.6 \
libusbguard.so.1 \
logrotate \
systemd"

inherit rpm
