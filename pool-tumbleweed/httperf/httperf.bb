SUMMARY = "A tool for measuring web server performance"
DESCRIPTION = "httperf is a tool for measuring web server performance. It provides a \
flexible facility for generating various HTTP workloads and for measuring \
server performance."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "0.9.0+git.20201206"

RPM_NAME = "httperf-0.9.0+git.20201206-2.7.aarch64.rpm"
RPM_HASH = "f3cfc15262012c55f1b9442c6a87c6a48d27b21553d270712a255fe1edc1fad231fa7a673ba9facaaf1367e6ce52eb621ce1323bfc600f74f5ab6a99a901d1d0"

RPROVIDES:${PN} += "httperf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libssl.so.3"

inherit rpm
