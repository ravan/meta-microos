SUMMARY = "ARM Compute Library - Graph part"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Library part."
LICENSE = "MIT"

PV = "53.2.0"

RPM_NAME = "libarm_compute_graph53-53.2.0-1.1.aarch64.rpm"
RPM_HASH = "9faab7b0fddd8caca2d02fd341a47457ef428c0549e04bb24c27684cebd44aa9f9efd36b0ae5a09b45c5b68d509d9996ad1cd3eeceddd0790b31cd182e54a1cc"

RPROVIDES:${PN} += "libarm-compute-graph.so.53 \
libarm-compute-graph53"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarm-compute.so.53 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
