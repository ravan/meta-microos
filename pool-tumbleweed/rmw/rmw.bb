SUMMARY = "Safe-remove utility for the command line"
DESCRIPTION = "rmw (ReMove to Waste) is a safe-remove and restore utility for the \
command line. By default it uses your desktop's trash (the \
FreeDesktop.org Trash specification) and needs no setup, though you \
can add your own waste folders. It can also purge items after a set \
number of days."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "rmw-0.10.0-1.1.aarch64.rpm"
RPM_HASH = "21ac60be63d4d0ff2d2ae2be7f31d4198872ece6d31fae66c6df9b09ffcc4feec10ce05c4660f35ed93b8eb6935ab3625c685f500f8edf9daa3863e931babf10"

RPROVIDES:${PN} += "rmw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcanfigger.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libmenuw.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
