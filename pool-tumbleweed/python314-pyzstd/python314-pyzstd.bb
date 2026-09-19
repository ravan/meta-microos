SUMMARY = "Python bindings to Zstandard (zstd) compression library"
DESCRIPTION = "Pyzstd module provides classes and functions for compressing and decompressing data, \
using Facebook's Zstandard (or zstd as short name) algorithm. \
 \
The API is similar to Python's bz2/lzma/zlib modules."
LICENSE = "BSD-3-Clause"

PV = "0.19.1"

RPM_NAME = "python314-pyzstd-0.19.1-1.3.noarch.rpm"
RPM_HASH = "827c2d6ee134a042e996b39ce3d751f44980b27fbb27b9a155254002a430aff2364d61240f22a8ba89442a0fe10f2e9226d9ae90420a589c558a515547e44b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyzstd \
python314-pyzstd \
python3dist-pyzstd"

RDEPENDS:${PN} += "python-abi"

inherit rpm
