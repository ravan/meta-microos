SUMMARY = "Headers for C/C++, cmake build description and libraries needed for development"
DESCRIPTION = "Although the Python interface is more polished and the primary focus of \
development, PyTorch also has a C++ frontend. This package contains the header \
to access the C/C++ interface."
LICENSE = "Apache-2.0 & Apache-2.0-with-LLVM-exception & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & MIT & Zlib"

PV = "2.13.0"

RPM_NAME = "python313-torch-devel-2.13.0-1.2.aarch64.rpm"
RPM_HASH = "139b39b49c02f6fb3f0c972a475c5afe78d59b7f59ce425d8c5293e4741e4bae2fa2c4a2489fff06d76b725b95e9092ae87a9a9c06ed5ad3125b45a6b97116d9"

RPROVIDES:${PN} += "python3-torch-devel \
python313-torch-devel"

RDEPENDS:${PN} += "python-abi \
python313-torch"

inherit rpm
