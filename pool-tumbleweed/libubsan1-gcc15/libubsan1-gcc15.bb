SUMMARY = "The GNU Compiler Undefined Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=undefined option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "15.3.0+git11272"

RPM_NAME = "libubsan1-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "debb6609c8dcd4021f3bdc2c918c0277ee1044be2ddc894e0d4810bcd279333ac93ba0325b0ce692e69b1d94b7b78c117a6853c1603e880852fa92cd5be3dad4"

RPROVIDES:${PN} += "libubsan.so.1 \
libubsan1 \
libubsan1-gcc15"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
