SUMMARY = "High-level tracing language for Linux eBPF"
DESCRIPTION = "High-level tracing language for Linux, allowing for instrumentation of \
in-kernel and userspace state. It makes use of only upstream features such as \
eBPF tracing (which builds on kprobes, uprobes, and a variety of other kernel \
technologies). BPFtrace's language is inspired by awk and C, as well as other \
tracers such as DTrace and SystemTap."
LICENSE = "Apache-2.0"

PV = "0.27.0"

RPM_NAME = "bpftrace-0.27.0-1.1.aarch64.rpm"
RPM_HASH = "1918da2ef46c1179e3b0799057b2b22e4cf547843e7b6e50afe3bf26882ac4e580eff3a6e6f711c7085266c81063d8d61d8c010dcaabf8d9b065cf85dcc3f367"

RPROVIDES:${PN} += "bpftrace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libbcc-bpf.so.0 \
libc.so.6 \
libclang-cpp.so.23.1 \
libclang.so.13 \
libelf.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libsframe.so.2 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
