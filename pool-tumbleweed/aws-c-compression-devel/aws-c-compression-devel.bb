SUMMARY = "Development files for aws-c-compression library"
DESCRIPTION = "A C99 implementation of Huffman encoding/decoding. \
 \
This package contains the development files."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "aws-c-compression-devel-0.3.2-1.3.aarch64.rpm"
RPM_HASH = "f2a6716df18a25a0cb011d83c6b66ff1e7de7a29f00f304ece0ecd12b95f8693ee365fda2f55b0e688d4eee5ca982a951fc40aa99634efbf631754a53f9b4e0f"

RPROVIDES:${PN} += "aws-c-compression-devel \
cmake-aws-c-compression"

RDEPENDS:${PN} += "libaws-c-compression1-0-0"

inherit rpm
