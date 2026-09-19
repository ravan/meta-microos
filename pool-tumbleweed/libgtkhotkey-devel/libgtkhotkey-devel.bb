SUMMARY = "Platform Independent Hotkey Handling for GTK+ Applications -- Development Files"
DESCRIPTION = "GtkHotkey is simple library offering a platform independent way for GTK+ \
applications to manage and bind desktop-wide hotkeys.  This package contains \
all necessary include files and libraries needed to develop applications that \
require these."
LICENSE = "LGPL-3.0-or-later"

PV = "0.2.1"

RPM_NAME = "libgtkhotkey-devel-0.2.1-18.9.aarch64.rpm"
RPM_HASH = "519e2256e6de72be4c638233a0e4ea9248f6a35486b52023eda70de01d76326bc7993ade175d2451f29f02d0bdbd7ee79ba9c5bffb4c959962b8e535ef98a7df"

RPROVIDES:${PN} += "libgtkhotkey-devel \
pkgconfig-gtkhotkey-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
gtk2-devel \
libgtkhotkey1 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-2.0"

inherit rpm
