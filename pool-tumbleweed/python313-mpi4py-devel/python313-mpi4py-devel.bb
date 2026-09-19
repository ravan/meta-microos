SUMMARY = "Development files for python313-mpi4py"
DESCRIPTION = "Development libraries and headers needed to build packages using python313-mpi4py."
LICENSE = "BSD-3-Clause"

PV = "4.1.2"

RPM_NAME = "python313-mpi4py-devel-4.1.2-1.2.aarch64.rpm"
RPM_HASH = "2e45f9f5f86c3890c2ea4fa2f0a272d070fa589b13ae89f3102ba205dd8e04ffb50bf790cf2f1dd5c16d1fb52e70c663335a9576a81ec88328d9ff03898e68b0"

RPROVIDES:${PN} += "python3-mpi4py-devel \
python313-mpi4py-devel"

RDEPENDS:${PN} += "python-abi \
python313-devel \
python313-mpi4py \
python313-mpi4py-common-devel"

inherit rpm
