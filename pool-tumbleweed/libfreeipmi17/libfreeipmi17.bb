SUMMARY = "FreeIPMI library"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification. \
 \
This package contains the libfreeipmi library."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.18"

RPM_NAME = "libfreeipmi17-1.6.18-1.3.aarch64.rpm"
RPM_HASH = "5cf97f3ef0f83e978ccc5d0dc681a35355b6c8860041df28e2e9c8db2bb534fc2259f8086ace2a9325c411d892a60ef5c1b98a3866b6d22b04552018225df745"

RPROVIDES:${PN} += "libfreeipmi.so.17 \
libfreeipmi17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libm.so.6"

inherit rpm
