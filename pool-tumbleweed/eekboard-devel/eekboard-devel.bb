SUMMARY = "Development Files for libskk"
DESCRIPTION = "The eekboard-devel package contains the header files."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "eekboard-devel-1.0.8-12.9.aarch64.rpm"
RPM_HASH = "76da96dbeb3a42afea117b9dbbcc9f689390f4b5b9363157c3221869d6de83f52e437900db8047db9a76159d7eb188d5002faa7d1089cad93fe3b44fc68136b0"

RPROVIDES:${PN} += "eekboard-devel \
pkgconfig-eek-0.90 \
pkgconfig-eek-gtk-0.90 \
pkgconfig-eek-xkl-0.90 \
pkgconfig-eekboard-0.90"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
eekboard \
pkgconfig-eek-0.90 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxklavier"

inherit rpm
