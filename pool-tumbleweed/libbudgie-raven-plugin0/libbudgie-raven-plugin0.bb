SUMMARY = "Shared library for Budgie raven plugins"
DESCRIPTION = "Shared library for budgie raven plugins to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.10.0+13"

RPM_NAME = "libbudgie-raven-plugin0-10.10.0+13-1.2.aarch64.rpm"
RPM_HASH = "dd598d78a4350163db57142e146df61e7d7ddc7e0a4ee93898cd24a059bc79181bb2a71d2a3f0e26e838b54d6fec2afa58683657c04d6719c24e344898eaa5de"

RPROVIDES:${PN} += "libbudgie-raven-plugin.so.0 \
libbudgie-raven-plugin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
