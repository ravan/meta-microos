SUMMARY = "C++ wrapper around SQLite 3.x - Development Files"
DESCRIPTION = "wxSQLite3 is a C++ wrapper around the public domain SQLite 3.x database \
and is specifically designed for use in programs based on the wxWidgets \
library."
LICENSE = "SUSE-wxWidgets-3.1"

PV = "4.9.11"

RPM_NAME = "wxsqlite3-devel-4.9.11-1.10.aarch64.rpm"
RPM_HASH = "46df19530a59f3ef9cf774d40b896d6612df4aa0cda39ad4a57bb41ff55b6d8307b50d754d1a410810b90a08f05173b4d17dc3607a9900c758cacb885c77552b"

RPROVIDES:${PN} += "pkgconfig-wxsqlite3 \
wxsqlite3-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwxcode-gtk2u-wxsqlite3-3-2-0"

inherit rpm
