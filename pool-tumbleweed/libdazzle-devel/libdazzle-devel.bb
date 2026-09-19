SUMMARY = "Collection of fancy features for GLib and Gtk+ -- Development Files"
DESCRIPTION = "This library is a companion library to GObject and Gtk+. \
It provides various features that are wished in the underlying \
library but are not for various reasons. In most cases, they are \
wildly out of scope for those libraries. In other cases, the design \
isn't quite generic enough to work for everyone. -- Development Files \
 \
This package provides the development files, and its documentation, for libdazzle."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "libdazzle-devel-3.44.0-2.7.aarch64.rpm"
RPM_HASH = "6312ce4c360263b7b2c21d6ebcc1941576a287cc45aee8227f58c9202b16d6c0babd267b435de53f7e1ff828ea09555dfabec3da1847ee4d963f1a4787ca803b"

RPROVIDES:${PN} += "libdazzle-devel \
pkgconfig-libdazzle-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dazzle-list-counters \
libdazzle-1-0-0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-libdazzle-1-0"

inherit rpm
