SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-mvapich3-ucx-doc-3.5-10.4.aarch64.rpm"
RPM_HASH = "0c27aad00821bd04402bc2eccdb3a1a718fe4dca13a0e936538ee6ea7412df2c30635774e182d771f76b0c541f7384f11196cf8f771d2249f99c27252cc0c141"

RPROVIDES:${PN} += "mpiP-mvapich3-ucx-doc"

RDEPENDS:${PN} += ""

inherit rpm
