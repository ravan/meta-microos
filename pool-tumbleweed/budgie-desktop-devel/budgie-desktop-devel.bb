SUMMARY = "Development files for the Budgie Desktop"
DESCRIPTION = "This package provides development files required for software to be \
able to use and link against the Budgie APIs, to create their own \
applets for the Budgie Panel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.10.0+13"

RPM_NAME = "budgie-desktop-devel-10.10.0+13-1.2.aarch64.rpm"
RPM_HASH = "897ab595ddf51824d5095f223b9aec896538667c00318b7f80ab6c2b9674d356efb9155ffd11b3db9611a5359f10d782f34888f30ea4c1bb1a7da5044c1d7efd"

RPROVIDES:${PN} += "budgie-desktop-devel \
pkgconfig-budgie-3.0 \
pkgconfig-budgie-raven-plugin-3.0 \
pkgconfig-budgie-theme-1.0 \
pkgconfig-budgie-windowing-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbudgie-appindexer0 \
libbudgie-plugin0 \
libbudgie-private0 \
libbudgie-raven-plugin0 \
libbudgie-windowing0 \
libbudgietheme0 \
libraven0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libpeas-2"

inherit rpm
