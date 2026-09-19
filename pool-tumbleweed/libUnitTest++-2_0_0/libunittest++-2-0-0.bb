SUMMARY = "A unit testing framework for C++"
DESCRIPTION = "UnitTest++ is a unit testing framework for C++. It was designed \
to do test-driven development on a wide variety of platforms. \
UnitTest++ is mostly standard C++ and makes minimal use of \
advanced library and language features."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "libUnitTest++-2_0_0-2.0.0-3.5.aarch64.rpm"
RPM_HASH = "f56612ecbb55f1ddd56c5c14be89cf4f1fb39b054a91d507bade1c579a090855869784dd9dfd63c08fbe383a203db773a4c1a15d3f3eff67356bd9e752cd9d45"

RPROVIDES:${PN} += "libUnitTest++-2-0-0 \
libUnitTest++-2.0.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
