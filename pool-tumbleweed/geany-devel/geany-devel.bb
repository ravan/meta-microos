SUMMARY = "Development files for the Geany IDE"
DESCRIPTION = "Geany is a text editor using the GTK+ toolkit with basic features of \
an integrated development environment."
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "geany-devel-2.1-1.7.aarch64.rpm"
RPM_HASH = "769b68b5689ea0cd8b31511971e1244057dee96cc101461904749a1f8721f053ae5b1239d4d9418085592af7879372fbd68534c3ece50197042070bd8bd65abf"

RPROVIDES:${PN} += "geany-devel \
pkgconfig-geany"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
geany \
gtk3-devel \
libgeany0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
