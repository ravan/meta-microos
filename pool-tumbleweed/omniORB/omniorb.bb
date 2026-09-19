SUMMARY = "A robust high performance CORBA ORB for C++ and Python"
DESCRIPTION = "omniORB is a robust high performance CORBA ORB for C++ and Python. \
 \
It adheres to version 2.6 of the CORBA specification and is fully \
interoperable with other CORBA ORBs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.2"

RPM_NAME = "omniORB-4.3.2-1.10.aarch64.rpm"
RPM_HASH = "9ab0bc6521fcfd9934f164dc2c790f9361af7b93e222305b565c18781d4b84a9f8b5f1aca69814d6155bb3fbb9bec5d0c1cb8ddcefd280301f5a0b6fb9c3ba89"

RPROVIDES:${PN} += "omniORB"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libomniORB4.so.3 \
libomnithread.so.4 \
libstdc++.so.6 \
python-abi"

inherit rpm
