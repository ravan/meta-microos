SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "llvm21-libc++abi1-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "1db7f346b2ba9873ea6654fba5884792eee4c0c44558822267eba51fa86890f8972c570f5ee19e39bb1193dc1a76769c59cfd952e6f106c4b90e1ebb767260af"

RPROVIDES:${PN} += "libc++abi.so.1 \
libc++abi1 \
llvm21-libc++abi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
