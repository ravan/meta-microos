SUMMARY = "ARM Compute Library -- devel"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Devel part, including headers."
LICENSE = "MIT"

PV = "53.2.0"

RPM_NAME = "ComputeLibrary-devel-53.2.0-1.1.aarch64.rpm"
RPM_HASH = "bdd8b57b4e85f7385c74aec0c79f412f9772d0f31a19e8ca10b575d68cea54726f1d45411ba99d63efb324ea1441c3d79a30c5812ecbb88d7847da0f78358281"

RPROVIDES:${PN} += "ComputeLibrary-devel"

RDEPENDS:${PN} += "ComputeLibrary \
libarm-compute-graph53 \
libarm-compute53 \
stb-devel"

inherit rpm
