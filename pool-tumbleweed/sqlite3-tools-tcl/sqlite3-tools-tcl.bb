SUMMARY = "Command line interface for SQLite 3 (tools)"
DESCRIPTION = "This package contains the extra CLI tools from sqlite3 source code that \
require TCL. This is currently only sqlite3_analyzer."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.53.2"

RPM_NAME = "sqlite3-tools-tcl-3.53.2-3.2.aarch64.rpm"
RPM_HASH = "f4c5b648158fcb082457c4df56614a21acc3a7bfe629fcb78fad75699dab6b998eafb4a0202d4bdce06f9ab3c0c1b8c2e9dcd142f16ab6f9649efab403a408d9"

RPROVIDES:${PN} += "sqlite3-tools-tcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtcl8.6.so"

inherit rpm
