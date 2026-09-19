SUMMARY = "GSettings integration of the dconf key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems. \
 \
This package provides a GSettings backend that uses dconf to store \
the settings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.49.0"

RPM_NAME = "gsettings-backend-dconf-0.49.0-1.5.aarch64.rpm"
RPM_HASH = "17764b03d5726b85b7af0c34f5d3aff401832c5551766d1f63f49ae06bba07cde7393ac0056f077d469fee88db62c37ea785c9dc89d623dcd1032af13d12380e"

RPROVIDES:${PN} += "gsettings-backend-dconf \
libdconfsettings.so"

RDEPENDS:${PN} += "/usr/bin/sh \
dconf \
glib2-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
