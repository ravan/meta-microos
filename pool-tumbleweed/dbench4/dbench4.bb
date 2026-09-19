SUMMARY = "File System Benchmark Similar to Netbench"
DESCRIPTION = "Dbench is a file system benchmark that generates load patterns similar \
to those of the commercial Netbench benchmark, but without requiring a \
lab of Windows load generators to run. It is now considered a de facto \
standard for generating load on the Linux VFS. \
 \
This is version 4 of dbench that does not produce results comparable \
with older versions."
LICENSE = "GPL-3.0-only"

PV = "4.0"

RPM_NAME = "dbench4-4.0-5.9.aarch64.rpm"
RPM_HASH = "d89e2f005621debe85b199bb2fc7bd3762a1b9e2670f54685b47bea24f5379fdf4618d1cb61c6a023fb380bc56996abb0492c0bd5e33a046594fffc16c7fea99"

RPROVIDES:${PN} += "dbench4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpopt.so.0"

inherit rpm
