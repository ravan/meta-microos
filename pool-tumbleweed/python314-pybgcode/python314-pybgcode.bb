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

RPM_NAME = "python314-pybgcode-0.2.0+git20240829.b5c57c4-2.6.aarch64.rpm"
RPM_HASH = "41fe55a08e107dfc7efe642ae7cd22a1382cafb46ed8f75cea5a3c0a5185a462718e09e8a8b65399174e037924bc96119d42e75e1ad75438b06ca6f5609b5bf4"

RPROVIDES:${PN} += "python3.14dist-pybgcode \
python314-pybgcode \
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
