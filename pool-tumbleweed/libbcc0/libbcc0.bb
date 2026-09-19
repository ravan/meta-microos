SUMMARY = "Shared library from the BPF Compiler Collection"
DESCRIPTION = "Shared Library from the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.37.0"

RPM_NAME = "libbcc0-0.37.0-4.1.aarch64.rpm"
RPM_HASH = "7aed5612eb5ee81e1aa26e3202441d4ae73d31b5c8f661da08e1c12689730dd17e70c647c1f4be390ca950dcf59bc60d85a266a431fcd259651dee713ac16e6e"

RPROVIDES:${PN} += "libbcc-bpf.so.0 \
libbcc.so.0 \
libbcc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
kernel \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libbpf.so.1 \
libc.so.6 \
libclang-cpp.so.23.1 \
libelf.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
