SUMMARY = "Prusa Block & Binary G-code reader / writer / converter"
DESCRIPTION = "A new G-code file format featuring the following improvements over the legacy G-code: \
1) Block structure with distinct blocks for metadata vs. G-code \
2) Faster navigation \
3) Coding & compression for smaller file size \
4) Checksum for data validity \
5) Extensivity through new (custom) blocks. For example, a file signature block may be welcome by corporate customers. \
 \
bgcode is a command line application which allows to convert gcode files from ascii to binary format and viceversa."
LICENSE = "AGPL-3.0-only"

PV = "0.2.0+git20240829.b5c57c4"

RPM_NAME = "libbgcode-0.2.0+git20240829.b5c57c4-2.4.aarch64.rpm"
RPM_HASH = "6e6fd01817cc9bd1522ab0b3b1561e71bbb336ca7e7f7b53fd37e856c8816d0f067c6812cf29a567f6c41e288c9513c000d57527fe06fc0aa9490ff74cdbf477"

RPROVIDES:${PN} += "libbgcode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbgcode-convert.so.0.2.0 \
libbgcode-core.so.0.2.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
