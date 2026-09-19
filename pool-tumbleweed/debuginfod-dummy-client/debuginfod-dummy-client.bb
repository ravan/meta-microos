SUMMARY = "Command line client for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The elfutils-debuginfod-client package contains a command-line frontend. \
The package is dummy."
LICENSE = "GPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "debuginfod-dummy-client-0.194-1.4.aarch64.rpm"
RPM_HASH = "c4a6abbd3c89b8fcd5a82e702ad9c0d16f05bcd2dd66d893a6810c3bf6727486bcea6af750331a943063f380922f9980c87386c5318eeacefb8c04f2f7d2f632"

RPROVIDES:${PN} += "debuginfod-client \
debuginfod-dummy-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdebuginfod.so.1 \
libdw.so.1 \
libelf.so.1"

inherit rpm
