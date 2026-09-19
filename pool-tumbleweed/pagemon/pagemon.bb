SUMMARY = "Interactive memory/page monitoring tool"
DESCRIPTION = "pagemon is a ncurses based interactive memory/page monitoring tool \
allowing one to browse the memory map of an active running process \
on Linux."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.06"

RPM_NAME = "pagemon-0.02.06-1.4.aarch64.rpm"
RPM_HASH = "4034a566d2e180ed4397ebff10dad5ad002a37a4cddd7d0e50f3b70f56b1e3fa90dd687c6fa3ad7b70cb0aafdea646e2479414606e9215d10704b3e8f0062727"

RPROVIDES:${PN} += "pagemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
