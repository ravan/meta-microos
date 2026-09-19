SUMMARY = "Python bindings for libbgcode"
DESCRIPTION = "A new G-code file format featuring the following improvements over the legacy G-code: \
1) Block structure with distinct blocks for metadata vs. G-code \
2) Faster navigation \
3) Coding & compression for smaller file size \
4) Checksum for data validity \
5) Extensivity through new (custom) blocks. For example, a file signature block may be welcome by corporate customers. \
 \
This package provides the Python language bindings for LibBGCode"
LICENSE = "AGPL-3.0-only"

PV = "0.2.0+git20240829.b5c57c4"

RPM_NAME = "python313-pybgcode-0.2.0+git20240829.b5c57c4-2.6.aarch64.rpm"
RPM_HASH = "7a92a86898e2586285589aeb9c8b42e55e06451d653552a8824c9dc723658a817eced9456c35848a1e5fc071b35899ae2f7806a00d00d8ee9ccaabf246792f99"

RPROVIDES:${PN} += "python3-pybgcode \
python3.13dist-pybgcode \
python313-pybgcode \
python3dist-pybgcode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbgcode-binarize.so.0.2.0 \
libbgcode-convert.so.0.2.0 \
libbgcode-core.so.0.2.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
