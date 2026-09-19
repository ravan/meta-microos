SUMMARY = "Boost.Contract runtime library"
DESCRIPTION = "Runtime support for Boost.Contract, a library that implements \
Design by Contract or DbC or contract programming."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_contract1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "0c4a7a528f0a359b36646b256975ccf52e3a1fc1d04121ac3e7e27bc5a466f5e0abc17447be1e8cfb38b66daa1c402009c2bb22bc111e372628bc29a615e385b"

RPROVIDES:${PN} += "libboost-contract.so.1.91.0 \
libboost-contract1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
