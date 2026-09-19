SUMMARY = "Utility to create a cache of gdk-pixbuf loaders"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter. \
 \
This package contains the utility to create the cache file needed for \
loadable modules."
LICENSE = "LGPL-2.1-or-later"

PV = "2.44.7"

RPM_NAME = "gdk-pixbuf-query-loaders-2.44.7-1.2.aarch64.rpm"
RPM_HASH = "e07c851022c783bfd6ce0325ac45f3aedfe054dd2ba96a4a7bcba64bec040eda8282cbcf51a0d523dcee1568bd4d303bddb12c2e286f01153d7b55461f287def"

RPROVIDES:${PN} += "gdk-pixbuf-query-loaders"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
