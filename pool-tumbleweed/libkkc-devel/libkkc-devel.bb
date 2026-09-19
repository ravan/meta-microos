SUMMARY = "Development files for libkkc"
DESCRIPTION = "libkkc provides a converter from Japanese Kana-string to Kana-Kanji-mixed-string. \
 \
This package contains its development headers and vala bindings."
LICENSE = "GPL-3.0-only"

PV = "0.3.6~git20240902.ce17a35"

RPM_NAME = "libkkc-devel-0.3.6~git20240902.ce17a35-4.3.aarch64.rpm"
RPM_HASH = "4280850edd2cafd5b631fc62fd7acd323c159937aa8e12bc1a81c38e246b7f77edce419839c087977c46afd04abad1ed02a5a6314977ff3e2df3c56a698689cd"

RPROVIDES:${PN} += "libkkc-devel \
pkgconfig-kkc-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libkkc2 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-json-glib-1.0"

inherit rpm
