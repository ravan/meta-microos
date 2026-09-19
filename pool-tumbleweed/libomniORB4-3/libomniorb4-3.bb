SUMMARY = "omniORB libraries"
DESCRIPTION = "Shared libraries providing the omniORB CORBA implementation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.2"

RPM_NAME = "libomniORB4-3-4.3.2-1.10.aarch64.rpm"
RPM_HASH = "326b76f9caa83c303f7f446c702959a7d4281fa768df370116e3aae2c673dded3ca57da28fcce11e50d4ce8918a5a8d71f54b2193ca92e915d8a53040ae22a00"

RPROVIDES:${PN} += "libCOS4.so.3 \
libCOSDynamic4.so.3 \
libomniCodeSets4.so.3 \
libomniConnectionMgmt4.so.3 \
libomniDynamic4.so.3 \
libomniORB4-3 \
libomniORB4.so.3 \
libomniZIOP4.so.3 \
libomniZIOPDynamic4.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libomnithread.so.4 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
