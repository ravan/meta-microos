SUMMARY = "Development files for libaec (Adaptive Entropy Coding library)"
DESCRIPTION = "Development files for libaec (Adaptive Entropy Coding library), a lossless \
compression library for low entropy data."
LICENSE = "BSD-2-Clause"

PV = "1.1.7"

RPM_NAME = "libaec-devel-1.1.7-1.3.aarch64.rpm"
RPM_HASH = "e9524b88d08275946a161d7cff0a18229145c4f8cc7d807eef7b15940825085ba789b85cf0e719d5b7012a0924695dbd096b2f0f5514c8eac81aa89170858a76"

RPROVIDES:${PN} += "cmake-libaec \
libaec-devel"

RDEPENDS:${PN} += "libaec0"

inherit rpm
