SUMMARY = "C library for managing eBPF programs and maps"
DESCRIPTION = "libbpf is a C library which provides API for managing eBPF programs and maps."
LICENSE = "LGPL-2.1-only"

PV = "1.7.0"

RPM_NAME = "libbpf1-1.7.0-2.1.aarch64.rpm"
RPM_HASH = "e5a161ad8a6e31f72de4cf93c3cfb9c8c52c8ce5e187207ac64c7987842177a9bfdc343167f05b58a60cc3a31e5de7b6401c2488119cb589b8097a97a7dad5a8"

RPROVIDES:${PN} += "libbpf.so.1 \
libbpf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libz.so.1"

inherit rpm
