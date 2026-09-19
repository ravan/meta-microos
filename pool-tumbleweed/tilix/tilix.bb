SUMMARY = "A tiling terminal emulator based on GTK+ 3"
DESCRIPTION = "A tiling terminal emulator for Linux using GTK+ 3"
LICENSE = "LGPL-3.0-only & MPL-2.0"

PV = "1.9.6"

RPM_NAME = "tilix-1.9.6-2.9.aarch64.rpm"
RPM_HASH = "df2951451d4d5f451efe46171dc6c63679260deffa1eb32c3cdb4d9925bceb61719c81a09ee21b37754a4bd9e90ef53688ba5b6753b9ab5175608dba2d8ffff1"

RPROVIDES:${PN} += "tilix"

RDEPENDS:${PN} += "/usr/bin/bash \
libX11.so.6 \
libc.so.6 \
libdruntime-ldc-shared.so.112 \
libgcc-s.so.1 \
libgtkd-3.so.0 \
libphobos2-ldc-shared.so.112 \
libvted-3.so.0"

inherit rpm
