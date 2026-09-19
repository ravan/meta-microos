SUMMARY = "Osmocom SNMP-like control interface library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
libosmoctrl is an SNMP-like control interface. In contrast to the VTY \
interface, the control interface is meant to be used by programs."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmoctrl0-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "d82ef93ff5d2be69f2b067c893a0ce73dd34f1814ee40cc1eaa5f73650048a210832f15a7f6850da61dc8158a92090f456393e516ea3148f74ccc25c00318cf7"

RPROVIDES:${PN} += "libosmoctrl.so.0 \
libosmoctrl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.22 \
libosmogsm.so.20 \
libosmovty.so.13 \
libtalloc.so.2"

inherit rpm
