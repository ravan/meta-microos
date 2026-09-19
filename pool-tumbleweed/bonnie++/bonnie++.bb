SUMMARY = "A Bonnie-Like File System Benchmark"
DESCRIPTION = "Bonnie++ is a benchmark suite aimed at performing a number of simple \
hard drive and file system performance tests."
LICENSE = "MIT"

PV = "2.00a"

RPM_NAME = "bonnie++-2.00a-2.9.aarch64.rpm"
RPM_HASH = "12d54831387d8b54709bcfaaf8d654b9d8a8b40037ba72ae8cfd63b98d8c9e8eca9aa79ef25adc29af5d310d8d9f37f3d51bb892771c2da71b5dd5c4ed508cb1"

RPROVIDES:${PN} += "bonnie++"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
