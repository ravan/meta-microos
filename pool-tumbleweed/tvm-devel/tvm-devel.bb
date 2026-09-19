SUMMARY = "Headers for the TVM Deep Learning Compiler Stack"
DESCRIPTION = "TVM is a deep learning compiler stack for CPUs, GPUs, and specialized accelerators. \
 \
This package contains the headers."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "tvm-devel-0.24.0-2.3.aarch64.rpm"
RPM_HASH = "616c64299f5322dcff5d65b07e6026ada3b4f0d600456be183b3e0ea5cc241c601dbd1642618b10d2e3b1cb0cc2f50d5aa6c9a99cd221d438686b21ff876075c"

RPROVIDES:${PN} += "cmake-tvm \
tvm-devel"

RDEPENDS:${PN} += "libtvm"

inherit rpm
