SUMMARY = "GObject Introspection Development Files"
DESCRIPTION = "The goal of the project is to describe the APIs and collect them in \
a uniform, machine readable format."
LICENSE = "LGPL-2.1-or-later"

PV = "1.86.0"

RPM_NAME = "gobject-introspection-devel-1.86.0-3.4.aarch64.rpm"
RPM_HASH = "2323422d9e6a2ed938c2194a9da07939169cd00a1f15dcd50d8872d658829366cc1d51199bd40e33323be0afd12d36f087a7428513f104731654c68ebfad6012"

RPROVIDES:${PN} += "gobject-introspection-devel \
pkgconfig-gobject-introspection-1.0 \
pkgconfig-gobject-introspection-no-export-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gobject-introspection \
libffi-devel \
libgirepository-1-0-1 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gobject-introspection-1.0"

inherit rpm
