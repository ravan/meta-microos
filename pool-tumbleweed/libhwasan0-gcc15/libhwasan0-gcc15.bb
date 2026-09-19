SUMMARY = "The GNU Compiler Hardware-assisted Address Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=hwaddress option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "15.3.0+git11272"

RPM_NAME = "libhwasan0-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "8334f03c7d338d3d7e4b5a2c55164816b361898cfbdba17440fda99202c19d9090832790ec43d9db3c9877c367287334436dc1be586ad5fe14245bb26523b38e"

RPROVIDES:${PN} += "libhwasan.so.0 \
libhwasan0 \
libhwasan0-gcc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
