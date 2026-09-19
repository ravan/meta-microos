SUMMARY = "Qt 6 connectivity libraries - Development files"
DESCRIPTION = "Development files for the Qt6 connectivity libraries."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-connectivity-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "8ffef27894bbe6410c76e212e387996f7719e0e85960958e572995eb41e8475a5fdc578d8f73e872015540f7cb9f984e11efa294459140aadcdce43b1d2b401f"

RPROVIDES:${PN} += "cmake-Qt6Bluetooth \
cmake-Qt6Nfc \
pkgconfig-Qt6Bluetooth \
pkgconfig-Qt6Nfc \
qt6-connectivity-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6DBus \
cmake-Qt6Network \
libQt6Bluetooth6 \
libQt6Nfc6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6DBus \
pkgconfig-Qt6Network \
qt6-connectivity"

inherit rpm
