SUMMARY = "Headers for C/C++, cmake build description and libraries needed for development"
DESCRIPTION = "Although the Python interface is more polished and the primary focus of \
development, PyTorch also has a C++ frontend. This package contains the header \
to access the C/C++ interface."
LICENSE = "Apache-2.0 & Apache-2.0-with-LLVM-exception & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & MIT & Zlib"

PV = "2.13.0"

RPM_NAME = "python314-torch-openmpi4-devel-2.13.0-1.2.aarch64.rpm"
RPM_HASH = "374b7261fa24ba6807a4f4229e6fd6d48489dbbaf1209100c5cdfaf422075d3fb9630c1b06edca4537ca978af5845211292222f95f0e0491a0dbf074136f9a8b"

RPROVIDES:${PN} += "python314-torch-openmpi4-devel"

RDEPENDS:${PN} += "python-abi \
python314-torch"

inherit rpm
