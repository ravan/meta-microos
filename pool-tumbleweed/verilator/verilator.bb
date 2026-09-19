SUMMARY = "Compiling Verilog HDL simulator"
DESCRIPTION = "Verilator compiles synthesizable Verilog (not test-bench code), plus \
some PSL, SystemVerilog and Synthesis assertions into an optimized \
model which is in turn wrapped inside a C++/SystemC module for faster \
execution."
LICENSE = "Artistic-2.0 | LGPL-3.0-only"

PV = "5.038"

RPM_NAME = "verilator-5.038-1.6.aarch64.rpm"
RPM_HASH = "8075cd3549176d51a50597743bc039394b12fb804551b1799fedb5c796e85b8bb3c785f6f5c2cf81321dce45e5dafd2155534fb9763d570aaf2bbc188b78d5e5"

RPROVIDES:${PN} += "verilator"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
