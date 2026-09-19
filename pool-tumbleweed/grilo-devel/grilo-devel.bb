SUMMARY = "Framework for browsing and searching media content -- Development Files"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.19"

RPM_NAME = "grilo-devel-0.3.19-2.5.aarch64.rpm"
RPM_HASH = "f2b39753c7ab7814a221cd315213a90507abf40aaa5c645bdd66fa5d25927e64e07b8917c49c02c2194919883c7dd229fd459ffda3f43006bc2922f462507ab2"

RPROVIDES:${PN} += "grilo-devel \
pkgconfig-grilo-0.3 \
pkgconfig-grilo-net-0.3 \
pkgconfig-grilo-pls-0.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgrilo-0-3-0 \
libgrlnet-0-3-0 \
libgrlpls-0-3-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-grilo-0.3 \
pkgconfig-libxml-2.0 \
typelib-1-0-Grl-0-3 \
typelib-1-0-GrlNet-0-3 \
typelib-1-0-GrlPls-0-3"

inherit rpm
