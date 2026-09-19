SUMMARY = "Development files for python314-mpi4py"
DESCRIPTION = "Development libraries and headers needed to build packages using python314-mpi4py."
LICENSE = "BSD-3-Clause"

PV = "4.1.2"

RPM_NAME = "python314-mpi4py-devel-4.1.2-1.2.aarch64.rpm"
RPM_HASH = "4b1fcd28f765296e723da63d28fe6a35b4af185c6a39e27499245a3677c24ef489fe046ee419900b2b9d767108afb90dd596e7be4e1990b0de7ad5758d897a51"

RPROVIDES:${PN} += "python314-mpi4py-devel"

RDEPENDS:${PN} += "python-abi \
python314-devel \
python314-mpi4py \
python314-mpi4py-common-devel"

inherit rpm
