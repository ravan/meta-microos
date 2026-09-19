SUMMARY = "Python bindings to Zstandard (zstd) compression library"
DESCRIPTION = "Pyzstd module provides classes and functions for compressing and decompressing data, \
using Facebook's Zstandard (or zstd as short name) algorithm. \
 \
The API is similar to Python's bz2/lzma/zlib modules."
LICENSE = "BSD-3-Clause"

PV = "0.19.1"

RPM_NAME = "python313-pyzstd-0.19.1-1.3.noarch.rpm"
RPM_HASH = "a030f460ca58dce7582b4e50677d0212fe333be8e88ba4760493be2fdb1eb6de5fff7cdbe667cb7998c074d493c5f085e26879b1890584b5e6f0cc55aa591bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyzstd \
python3.13dist-pyzstd \
python313-pyzstd \
python3dist-pyzstd"

RDEPENDS:${PN} += "python-abi"

inherit rpm
