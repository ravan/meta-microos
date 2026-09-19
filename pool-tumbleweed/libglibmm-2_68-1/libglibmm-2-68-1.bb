SUMMARY = "C++ Interface for Glib"
DESCRIPTION = "Glibmm is the official C++ interface for the popular cross-platform \
library Glib. It provides non-UI API that is not available in standard \
C++ and makes it possible for gtkmm to wrap GObject-based APIs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.1"

RPM_NAME = "libglibmm-2_68-1-2.88.1-1.2.aarch64.rpm"
RPM_HASH = "b539957799bc60a554db3448502f4c0dbae67fa94e877d6786648eff3cdf3bce56057a8441fcba0b8c95178699d8989a84ac065fd028251c782d6cfa1182decc"

RPROVIDES:${PN} += "libglibmm-2-68-1 \
libglibmm-2.68.so.1 \
libglibmm-generate-extra-defs-2.68.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libsigc-3.0.so.0 \
libstdc++.so.6"

inherit rpm
