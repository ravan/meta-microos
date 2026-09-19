SUMMARY = "Development files for ibis"
DESCRIPTION = "Development files for ibis."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.0"

RPM_NAME = "ibis-devel-0.16.0-1.3.aarch64.rpm"
RPM_HASH = "d91891d56199e84b10891685a6b4248fc5e3edfb2bf01e9d91de53e58144639dbef85995b6b7336b1ad4f4a9dd4818ae52d285dd838fa08056f33628ade75db8"

RPROVIDES:${PN} += "ibis-devel \
pkgconfig-ibis"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-birb \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-hasl \
pkgconfig-pango \
typelib-1-0-Ibis-1-0"

inherit rpm
