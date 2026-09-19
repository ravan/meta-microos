SUMMARY = "Headers for C/C++, cmake build description and libraries needed for development"
DESCRIPTION = "Although the Python interface is more polished and the primary focus of \
development, PyTorch also has a C++ frontend. This package contains the header \
to access the C/C++ interface."
LICENSE = "Apache-2.0 & Apache-2.0-with-LLVM-exception & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & MIT & Zlib"

PV = "2.13.0"

RPM_NAME = "python314-torch-devel-2.13.0-1.2.aarch64.rpm"
RPM_HASH = "b21cd176e1b2b8d171ebe84ebc5757dff98cb361324b8ae31d39636011b4dce5321466b024aa493fe49a80a736fb364a0fda9fd2e4ad95a34835e9af596cba14"

RPROVIDES:${PN} += "python314-torch-devel"

RDEPENDS:${PN} += "python-abi \
python314-torch"

inherit rpm
