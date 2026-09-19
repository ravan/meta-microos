SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Tools to work with various xml streams."
LICENSE = "MPL-2.0"

PV = "0.21.0"

RPM_NAME = "liborcus-tools-0.21.0-1.4.aarch64.rpm"
RPM_HASH = "eb4b72843892101e6461fb001fba2327a62c5192c16849939fbda178aff26e23a9fada3925b5bb2d376cb0b0d5fb7ca28e258965bc33f222c82a536af7c40653"

RPROVIDES:${PN} += "liborcus-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
liborcus-0-21-0 \
liborcus-0.21.so.0 \
liborcus-mso-0.21.so.0 \
liborcus-parser-0.21.so.0 \
liborcus-spreadsheet-model-0.21.so.0 \
libstdc++.so.6"

inherit rpm
