SUMMARY = "Investigate kernel error call stacks"
DESCRIPTION = "Retsnoop is a BPF-based tool for non-intrusive mass-tracing of Linux kernel \
internals. Retsnoop's main goal is to provide a flexible and ergonomic way \
to extract the exact information from the kernel that is useful to the user. \
Retsnoop achieves its goal by low-overhead non-intrusive tracing of a \
of kernel functions, intercepting their entries and exits. Retsnoop's central \
concept is a user-specified set of kernel functions of interest. This allows \
retsnoop to capture high-relevance data by letting the user flexibly control \
a relevant subset of kernel functions. All other kernel functions are ignored \
and don't pollute captured data with irrelevant information."
LICENSE = "BSD-2-Clause"

PV = "0.11"

RPM_NAME = "retsnoop-0.11-2.4.aarch64.rpm"
RPM_HASH = "55479ae45086e4ecbf1d0d16cd6981985b4da4a8f4844dfc08d913423e694589344623eb6ec3dae6ac17cd7e91bae598c6cbe17ea8d33a27b115403c1ad2dd62"

RPROVIDES:${PN} += "retsnoop"

RDEPENDS:${PN} += "libc.so.6 \
libelf.so.1 \
libz.so.1"

inherit rpm
