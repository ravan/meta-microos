SUMMARY = "Breeze icon theme - icon library"
DESCRIPTION = "Breeze-icons is a freedesktop.org compatible icon theme. \
This package provides a library containing icons, resources, and functions \
to use them. It is meant to be used for self contained deployments."
LICENSE = "LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "libKF6BreezeIcons6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "a97c6673629697ec84644ef05cb5e5dfaa517bb50d3e025b13e9dd1e810bee0f981512060417dc6829c732b94fd51e17ace2c9be57c09a391d0d22631f75abea"

RPROVIDES:${PN} += "libKF6BreezeIcons.so.6 \
libKF6BreezeIcons6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6"

inherit rpm
