SUMMARY = "Qt 6 WebChannelQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebChannelQuick library"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webchannelquick-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9b0764103cc6c1946c373bac5f946f5e40d243fefd7a1efaf5ad5ab601be098c81bf55e13817e82a02a5c964938c0d74b2c68f6ae48452158689610fb656c44c"

RPROVIDES:${PN} += "cmake-Qt6WebChannelQuick \
pkgconfig-Qt6WebChannelQuick \
qt6-webchannelquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6WebChannel \
libQt6WebChannelQuick6"

inherit rpm
