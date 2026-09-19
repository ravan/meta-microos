SUMMARY = "Filesystem Benchmark"
DESCRIPTION = "Blogbench is a portable filesystem benchmark that tries to reproduce the load \
of a real-world busy file server. It stresses the filesystem with multiple \
threads performing random reads, writes, and rewrites in order to get a \
realistic idea of the scalability and the concurrency a system can handle."
LICENSE = "ISC"

PV = "1.2"

RPM_NAME = "blogbench-1.2-2.3.aarch64.rpm"
RPM_HASH = "89fc6facf4f68cc8caee5cd2ce9f46e745ea59f77fedff40b2d2504767cc1adc9361d02772e50e3915d59a6ac7c1573fee3a044960a11cabe7dfaad400470ca6"

RPROVIDES:${PN} += "blogbench"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
