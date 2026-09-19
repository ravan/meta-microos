SUMMARY = "Tests for the gjs package"
DESCRIPTION = "The gjs-tests package contains tests that can be used to verify \
the functionality of the installed gjs package."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "1.88.1"

RPM_NAME = "gjs-tests-1.88.1-2.1.aarch64.rpm"
RPM_HASH = "7e85144bf41153b2181a25023fc362e8945b7143351ae4e160232c00c668f00c11ac62cf0c61210464783666d2137d40b0fa8f3993c0e9e23105434cfdaa3aa4"

RPROVIDES:${PN} += "gjs-tests \
libgimarshallingtests.so \
libgjstesttools.so \
libregress.so \
libutility.so \
libwarnlib.so \
typelib-GIMarshallingTests \
typelib-GjsTestTools \
typelib-Regress \
typelib-RegressUnix \
typelib-Utility \
typelib-WarnLib"

RDEPENDS:${PN} += "/usr/bin/sh \
gjs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libgjs.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmozjs-140.so.0 \
libstdc++.so.6 \
typelib-GLib \
typelib-GLibUnix \
typelib-GObject \
typelib-Gdk \
typelib-GioUnix \
typelib-GjsTestTools \
typelib-Gtk \
typelib-RegressUnix \
typelib-Utility \
typelib-WarnLib \
typelib-cairo"

inherit rpm
