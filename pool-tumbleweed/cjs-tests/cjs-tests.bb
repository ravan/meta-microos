SUMMARY = "Tests for the cjs package"
DESCRIPTION = "The cjs-tests package contains tests that can be used to verify \
the functionality of the installed cjs package."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "140.0"

RPM_NAME = "cjs-tests-140.0-2.1.aarch64.rpm"
RPM_HASH = "e1a8bf0c15ebafa79ad291514034d5c7ac8f3430337e6b6cb576a7175005121edc572f10dc5df48a3a6394ec8e771901f6e9f4a6ddca7e5b1607c4dfbcf85363"

RPROVIDES:${PN} += "cjs-tests \
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
cjs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcjs.so.0 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
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
