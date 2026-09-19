SUMMARY = "File System Benchmark Similar to Netbench"
DESCRIPTION = "Dbench is a file system benchmark that generates load patterns similar \
to those of the commercial Netbench benchmark, but without requiring a \
lab of Windows load generators to run. It is now considered a de facto \
standard for generating load on the Linux VFS."
LICENSE = "GPL-2.0+"

PV = "3.04"

RPM_NAME = "dbench-3.04-170.9.aarch64.rpm"
RPM_HASH = "249e3cc3ccc1ed4ca71e5bc51265b0d67dc7770552b1656df911162c0905faf4bdf2225c91b03a69a4e020db00649f87de31c9417076fb1689ba561bc1761ca9"

RPROVIDES:${PN} += "dbench"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
