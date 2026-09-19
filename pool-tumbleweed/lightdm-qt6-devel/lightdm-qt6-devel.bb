SUMMARY = "Development Files for liblightdm-qt6-3-0"
DESCRIPTION = "This package contains development files needed for developing \
Qt6-based LightDM clients."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "lightdm-qt6-devel-1.32.0-9.4.aarch64.rpm"
RPM_HASH = "3e37c3c36eeea5f0a08642462a52bc8f25303d612236cc6be7f0f8bee5d041871c819883751e5b0196421f566da2e9464823ef35d179ac8242aa9d8216ddd462"

RPROVIDES:${PN} += "lightdm-qt6-devel \
pkgconfig-liblightdm-qt6-3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblightdm-qt6-3-0 \
pkgconfig-Qt6Core \
pkgconfig-Qt6DBus \
pkgconfig-Qt6Gui"

inherit rpm
