SUMMARY = "Development headers for Boost.MPI library"
DESCRIPTION = "Development headers for Boost.MPI boost library \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_mpi-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "60013013f931a420de299886fc0a28a293cb4db9a75cef6187e6bac3aeca00f764f3a49a841a435f3f666285b9ffdee7882f9a69bed922eaa7b79dbdbf5177e9"

RPROVIDES:${PN} += "libboost-mpi-devel"

RDEPENDS:${PN} += "libboost-mpi1-91-0-devel"

inherit rpm
