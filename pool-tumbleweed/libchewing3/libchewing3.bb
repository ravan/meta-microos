SUMMARY = "Chewing libraries"
DESCRIPTION = "This package contains libraries for Chewing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "libchewing3-0.12.0-1.4.aarch64.rpm"
RPM_HASH = "6e2343ab8760e691b6fb5261a9df5e95aa2c9db27c0c2994581eefdb79a2e022564f1acbfda0ceaa35aec016c0111206609afc0cba7623ab67d426d7161f94ac"

RPROVIDES:${PN} += "libchewing.so.3 \
libchewing3"

RDEPENDS:${PN} += "/sbin/ldconfig \
chewing-data \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsqlite3.so.0"

inherit rpm
