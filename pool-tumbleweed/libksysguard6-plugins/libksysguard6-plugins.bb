SUMMARY = "Task management and system monitoring library -- plugins"
DESCRIPTION = "Task management and system monitoring library. This package contains plugins."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libksysguard6-plugins-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "c598fa9f138b331f1b617af2e2649a8a8d424542dc3fcbaf5e0165e4ff825cda562cf0d79118a677b4a6fd5a6dda7bf8d7346222bf6c1c18f29933d4d897a049"

RPROVIDES:${PN} += "libksysguard5-helper \
libksysguard5-plugins \
libksysguard6-plugins"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libdrm.so.2 \
libgcc-s.so.1 \
libksysguard6 \
libnl-3.so.200 \
libpcap.so.1 \
libprocesscore.so.11 \
libstdc++.so.6 \
libudev.so.1 \
permissions"

inherit rpm
