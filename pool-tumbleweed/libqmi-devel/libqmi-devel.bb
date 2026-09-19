SUMMARY = "Development files for the QMI device control library"
DESCRIPTION = "A GLib/GIO based library to control QMI devices \
 \
This package contains files required to link sources against libqmi."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "libqmi-devel-1.38.0-1.3.aarch64.rpm"
RPM_HASH = "11a185ee97788551df631e36dffac6b940df82e6e1d85f559d6ded8265f43ca7ac7dc27d5501dd0067836fe0db8209e42d634d59ef952089411f713ae48f0f97"

RPROVIDES:${PN} += "libqmi-devel \
pkgconfig-qmi-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqmi-glib5 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-mbim-glib \
pkgconfig-qrtr-glib \
typelib-1-0-Qmi-1-0"

inherit rpm
