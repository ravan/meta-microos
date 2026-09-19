SUMMARY = "Python bindings for the omniORB CORBA implementation"
DESCRIPTION = "omniORB is a robust high performance CORBA ORB for C++ and Python."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.2"

RPM_NAME = "omniORBpy-4.3.2-1.10.aarch64.rpm"
RPM_HASH = "a13f3d8902e018ca2d1ce65a5de8b858793d2aeaaa0a134c32e28dc3b1f2cae7057f2f7f4714b494ea2a8c5671644035f51a7bd383b7d61ed9d1c0ed2126aecc"

RPROVIDES:${PN} += "omniORBpy"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libomniCodeSets4.so.3 \
libomniConnectionMgmt4.so.3 \
libomniORB4.so.3 \
libomniZIOP4.so.3 \
libomnithread.so.4 \
libstdc++.so.6 \
python-abi"

inherit rpm
