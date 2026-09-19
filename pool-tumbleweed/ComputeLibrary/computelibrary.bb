SUMMARY = "ARM Compute Library"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Examples binaries part."
LICENSE = "MIT"

PV = "53.2.0"

RPM_NAME = "ComputeLibrary-53.2.0-1.1.aarch64.rpm"
RPM_HASH = "b461a04d51469b998069ae76907a3e9bcfb9933903b2f90417e49b22696d15e23b3b0b582cb725553e1e6fd5f5f86416316a84815e30677e28f21a942ea25faf"

RPROVIDES:${PN} += "ComputeLibrary"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libarm-compute-graph.so.53 \
libarm-compute.so.53 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
