SUMMARY = "Handles OS-specific details when using serial ports"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products. \
 \
libserialport is a minimal, cross-platform shared library written in C \
that is intended to take care of the OS-specific details when writing \
software that uses serial ports."
LICENSE = "LGPL-3.0-or-later"

PV = "0.1.2"

RPM_NAME = "libserialport0-0.1.2-1.7.aarch64.rpm"
RPM_HASH = "573298f843c92af1fabdcbbd3e351cdebfe861c0e7a31e65e6ce46d20c857011d9357cdcd88657492e5a5c56b68b8004662ff810b0f5f59b0fb44b39bf6202d7"

RPROVIDES:${PN} += "libserialport.so.0 \
libserialport0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
