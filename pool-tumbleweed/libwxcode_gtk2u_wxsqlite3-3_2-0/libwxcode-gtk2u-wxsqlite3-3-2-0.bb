SUMMARY = "C++ wrapper around SQLite 3.x"
DESCRIPTION = "wxSQLite3 is a C++ wrapper around the public domain SQLite 3.x database \
and is specifically designed for use in programs based on the wxWidgets \
library."
LICENSE = "SUSE-wxWidgets-3.1"

PV = "4.9.11"

RPM_NAME = "libwxcode_gtk2u_wxsqlite3-3_2-0-4.9.11-1.10.aarch64.rpm"
RPM_HASH = "52d6a7c5189020adbc553dacea21fb5785ba8eae33879e6bbed20923c8e79c0b53e3e532cfdba8999babeeba16d089ef4fbe3da7318839a29b3fdb017b664c57"

RPROVIDES:${PN} += "libwxcode-gtk2u-wxsqlite3-3-2-0 \
libwxcode-gtk2u-wxsqlite3-3.2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
