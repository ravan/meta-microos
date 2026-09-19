SUMMARY = "A suite of programs to modify Transport Tycoon Deluxe's GRF files"
DESCRIPTION = "A suite of programs to modify Transport Tycoon Deluxe's GRF files. \
Contains GRFCodec for encoding and decoding the actual GRF files, \
GRFDiff and GRFMerge for making and applying patches for GRF files, \
GRFID for extracting the (unique) NewGRF identifier and NFORenum, \
a format correcter and linter for the NFO language. NFO and PCX \
or PNG files are encoded to form GRF files."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.6+39"

RPM_NAME = "grfcodec-6.0.6+39-1.21.aarch64.rpm"
RPM_HASH = "8e0c8db2bcc55d0f8802391a4d6719fb7613a6dc42ca1b4b1c6a7ca8c279ccaf350e6b76396fbfa13f1111bec2f85352aaab6393ac9f66aef2346cedb4123ea8"

RPROVIDES:${PN} += "grfcodec \
nforenum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
