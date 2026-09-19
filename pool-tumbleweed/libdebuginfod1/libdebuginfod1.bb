SUMMARY = "Library for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The libdebuginfod1 package contains shared libraries \
dynamically loaded from -ldw, which use a debuginfod service \
to look up debuginfo and associated data. Also includes a \
command-line frontend."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "libdebuginfod1-0.194-1.2.aarch64.rpm"
RPM_HASH = "a556a4eb2583ce6a7c05072936cd086c03e6e9991d6c1511a5bdc56ea6829775ea4d16e7a8d797df1b3bd274e612090f104baf00b4ead1e72aeaf823efe3b3be"

RPROVIDES:${PN} += "libdebuginfod.so.1 \
libdebuginfod1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libelf.so.1 \
libjson-c.so.5"

inherit rpm
