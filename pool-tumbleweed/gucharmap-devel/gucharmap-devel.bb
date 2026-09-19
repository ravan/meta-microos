SUMMARY = "A Featureful Unicode Character Map -- Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "17.0.2"

RPM_NAME = "gucharmap-devel-17.0.2-1.4.aarch64.rpm"
RPM_HASH = "701cddd21edbc7d96cede02d2b5a425f974a825139a1c9549a70342cf45d48ab4c866e7d2d39a4c64dd2fdd335161b11bf0471e807bb771aa854cdd2965fe552"

RPROVIDES:${PN} += "gucharmap-devel \
pkgconfig-gucharmap-2.90"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgucharmap-2-90-7 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libpcre2-8 \
typelib-1-0-Gucharmap-2-90"

inherit rpm
