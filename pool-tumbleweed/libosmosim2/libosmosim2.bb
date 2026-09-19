SUMMARY = "Osmocom SIM card related utility library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmosim library in particular contains routines for SIM card \
access."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmosim2-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "d2fdfda1d3c0d5260bb709de336c495a838467ba7f129eed07cee16c4dada5427ad767569ceaced46d800c3ffdb87cbd0a9c561624c4fc879a779c4e04655b67"

RPROVIDES:${PN} += "libosmosim.so.2 \
libosmosim2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.22 \
libosmogsm.so.20 \
libpcsclite.so.1 \
libtalloc.so.2"

inherit rpm
