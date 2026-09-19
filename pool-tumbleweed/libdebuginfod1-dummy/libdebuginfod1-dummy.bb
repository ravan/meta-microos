SUMMARY = "Library for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The libdebuginfod1 package contains shared libraries \
dynamically loaded from -ldw, which use a debuginfod service \
to look up debuginfo and associated data. Also includes a \
command-line frontend. \
The package is dummy."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "libdebuginfod1-dummy-0.194-1.4.aarch64.rpm"
RPM_HASH = "8f00ae15d9041b815f643c3c0a1b0dac1f3c92d9f4778a711c032e29cdb0f1c991577d0e18c029cf4672a3383bced0a0137c8d95473f198258643a07d33422b0"

RPROVIDES:${PN} += "libdebuginfod.so.1 \
libdebuginfod1 \
libdebuginfod1-dummy"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
