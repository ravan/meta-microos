SUMMARY = "Tool for inspection and manipulation of BPF programs and maps"
DESCRIPTION = "bpftool allows for inspection and simple modification of BPF objects (programs \
and maps) on the system."
LICENSE = "GPL-2.0-only"

PV = "7.7.0"

RPM_NAME = "bpftool-7.7.0-2.1.aarch64.rpm"
RPM_HASH = "3c9e9a3f91e3e5535cf78d9d2ae8ab586bf250dec94e129bd60dae93b949425c2431e4f2e7844ccac6c6f6dd26733890603c53336f136baa56606ace615d48fd"

RPROVIDES:${PN} += "bpftool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libelf.so.1 \
libsframe.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
