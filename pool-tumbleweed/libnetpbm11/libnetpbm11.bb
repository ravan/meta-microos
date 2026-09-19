SUMMARY = "Libraries for the NetPBM (NetPortableBitmap) Graphic Formats"
DESCRIPTION = "These are the libs for the netpbm graphic formats. The tools can be \
found in the netpbm package. The sources are contained in the netpbm \
source package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & IJG & MIT & SUSE-Public-Domain"

PV = "11.14.0"

RPM_NAME = "libnetpbm11-11.14.0-1.3.aarch64.rpm"
RPM_HASH = "c46d1aa1627f3cc9eece30af68cef912079064c0b218a614873a5d52f57df00611e23432164d4d74acc96debc69dfdd2df46d47bbf93529d8331713ae801fe4b"

RPROVIDES:${PN} += "libnetpbm \
libnetpbm.so.11 \
libnetpbm11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
