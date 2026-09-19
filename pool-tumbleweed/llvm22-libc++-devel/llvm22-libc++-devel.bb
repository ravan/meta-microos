SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "llvm22-libc++-devel-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "2b5e5c7db4863fcf6b57766e36dee97285ea533bafe29b886ce70759facd7337832ceeb41c9ff6040c9696772296a005332ef041557f0e5034f0e02ee5a71689"

RPROVIDES:${PN} += "libc++.so \
llvm22-libc++-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++1 \
libc++abi.so"

inherit rpm
