SUMMARY = "Headers for C/C++, cmake build description and libraries needed for development"
DESCRIPTION = "Although the Python interface is more polished and the primary focus of \
development, PyTorch also has a C++ frontend. This package contains the header \
to access the C/C++ interface."
LICENSE = "Apache-2.0 & Apache-2.0-with-LLVM-exception & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & MIT & Zlib"

PV = "2.13.0"

RPM_NAME = "python313-torch-openmpi4-devel-2.13.0-1.2.aarch64.rpm"
RPM_HASH = "9a688f6c5762c3bb4f7f848f21aef5d7e698df37c1c2212a8cc4a5c343869cb427bcb7fb1134a9523473a44193e4cb4511343ae006eb85cee69bfab7fca67bd6"

RPROVIDES:${PN} += "python3-torch-openmpi4-devel \
python313-torch-openmpi4-devel"

RDEPENDS:${PN} += "python-abi \
python313-torch"

inherit rpm
