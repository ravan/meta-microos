SUMMARY = "Development files for the MATE panel applet library"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "mate-panel-devel-1.28.1-2.14.aarch64.rpm"
RPM_HASH = "5d7f9dc88b0488d6b28cc30c1f3ac8b292789017c16577357809fb6e9d59754c2363cad65db9fa585612235f2dfd206830a60bd608f558a17f256807f83decc4"

RPROVIDES:${PN} += "mate-panel-devel \
pkgconfig-libmatepanelapplet-4.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmate-panel-applet-4-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-MatePanelApplet-4-0"

inherit rpm
