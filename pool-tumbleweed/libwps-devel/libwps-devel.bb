SUMMARY = "Files for Developing with libwps"
DESCRIPTION = "libwps is a library for importing the Microsoft Works word processor \
and spreadsheet file format. \
 \
This package contains the libwps development files."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.4.14"

RPM_NAME = "libwps-devel-0.4.14-1.12.aarch64.rpm"
RPM_HASH = "8a9cd87c336ee97070055441697ef8d3920a6bf2cdd3e8cfb0bc47e334d5b7e78942e3bdfec25010d0782b1da37eb2a1a073451822026b682ee4c843b0199577"

RPROVIDES:${PN} += "libwps-devel \
pkgconfig-libwps-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwps-0-4-4 \
pkgconfig-librevenge-0.0"

inherit rpm
