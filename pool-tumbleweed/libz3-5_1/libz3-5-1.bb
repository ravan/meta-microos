SUMMARY = "Library for the Z3 SMT theorem prover"
DESCRIPTION = "Z3 is a Satisfiability Modulo Theories (SMT) solver and integrates \
several decision procedures. \
 \
This subpackage contains the Z3 runtime library needed for Z3 and \
other projects."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "libz3-5_1-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "3fcf538e4bbb6d909602b1508c0c53155b15c00b583b3ad94fbe0abffe31e18647b4b7a52629238fbee6f5f0fd611e97ee54728ba9ede69b4b46bdf90b614bc9"

RPROVIDES:${PN} += "libz3-5-1 \
libz3.so.5.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
