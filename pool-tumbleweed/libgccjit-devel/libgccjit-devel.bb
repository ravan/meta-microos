SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "libgccjit-devel-16-1.1.aarch64.rpm"
RPM_HASH = "51087fbe0171a02dafa5f74dd87c884ac47ec774c66d3e284c83421b1e73399e8be945943acd9d0340723ef54125b0c8d2c9ed38aaa96bbf950568ac9d651ce5"

RPROVIDES:${PN} += "libgccjit-devel"

RDEPENDS:${PN} += "libgccjit0-devel-gcc16"

inherit rpm
