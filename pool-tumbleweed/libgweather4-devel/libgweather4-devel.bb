SUMMARY = "Development files for libgweather, a weather info retrieval library"
DESCRIPTION = "This is a library to download weather information from online sources. \
This package provides the development files."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "libgweather4-devel-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "c694df02565d20b9c45126cb16c706e53e24d5298dbf3c919623a6aacd6b397e652eca70825c004c74212bfe3c2e67ed6e02e34b8602e7a25b058a9c5df72c1d"

RPROVIDES:${PN} += "libgweather4-devel \
pkgconfig-gweather4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgweather-4-0 \
pkgconfig-geocode-glib-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GWeather-4-0"

inherit rpm
