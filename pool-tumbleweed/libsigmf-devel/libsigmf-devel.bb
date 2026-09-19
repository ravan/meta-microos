SUMMARY = "Development files for libsigmf"
DESCRIPTION = "libsigmf is header-only, so this package carries the entire library: \
the SigMF headers, the FlatBuffers schemas and the CMake package config."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "libsigmf-devel-1.0.2-1.1.aarch64.rpm"
RPM_HASH = "6bb9a74a039a3d9004da10b4a9eae8ffc8f72fb7423278bfd27b1c35623f6a10e25efcec343d4113b227953645c1d86f7413aff21670d96767efcb97d0f61bbb"

RPROVIDES:${PN} += "cmake-libsigmf \
libsigmf-devel"

RDEPENDS:${PN} += "flatbuffers-devel \
pkgconfig-nlohmann-json"

inherit rpm
