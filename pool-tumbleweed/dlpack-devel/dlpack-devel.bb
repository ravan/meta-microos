SUMMARY = "DLPack: Open In Memory Tensor Structure"
DESCRIPTION = "DLPack is an open in-memory tensor structure to for sharing tensor among frameworks. DLPack enables: \
 * Easier sharing of operators between deep learning frameworks. \
 * Easier wrapping of vendor level operator implementations, allowing collaboration when introducing new devices/ops. \
 * Quick swapping of backend implementations, like different version of BLAS \
 * For final users, this could bring more operators, and possibility of mixing usage between frameworks."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "dlpack-devel-1.3-1.4.aarch64.rpm"
RPM_HASH = "4d21326048024543d72c0220732f58dca2f9d4c53cc214d22326975e3a3efdc7b4b75fb109c1ca49b2ac906db4a4b3c0471509f2b51b2c73c0c735dcd6b8cfe1"

RPROVIDES:${PN} += "cmake-dlpack \
dlpack-devel"

RDEPENDS:${PN} += ""

inherit rpm
