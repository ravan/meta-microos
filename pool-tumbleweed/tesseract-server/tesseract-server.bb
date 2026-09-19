SUMMARY = "Tesseract standalone server"
DESCRIPTION = "This package provides the server files for the Tesseract game."
LICENSE = "Zlib"

PV = "2024_06_15"

RPM_NAME = "tesseract-server-2024_06_15-2.1.aarch64.rpm"
RPM_HASH = "e667aa4e2ce2d0a856c942fd6d04fbba70622d02973fcbbc18356bfcaee3f6a47250cb2de9197a6dee151c64dee13dac609d9541c70033e6ce9960ecba0b895f"

RPROVIDES:${PN} += "tesseract-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
