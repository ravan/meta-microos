SUMMARY = "Spreadsheet file processing library"
DESCRIPTION = "Standalone file import filter library for spreadsheet documents. Currently \
under development are ODS, XLSX and CSV import filters."
LICENSE = "MPL-2.0"

PV = "0.21.0"

RPM_NAME = "liborcus-0_21-0-0.21.0-1.4.aarch64.rpm"
RPM_HASH = "ccb2efc481954e448df84103b0d992b0707cb3258b5445258223355659279877899983bc2f4d08c2f1dae79dc0e48071f28ccd524f721c24657c00c77ae4f3eb"

RPROVIDES:${PN} += "liborcus-0-21-0 \
liborcus-0.21.so.0 \
liborcus-mso-0.21.so.0 \
liborcus-parser-0.21.so.0 \
liborcus-spreadsheet-model-0.21.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-iostreams.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libixion-0.20.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
