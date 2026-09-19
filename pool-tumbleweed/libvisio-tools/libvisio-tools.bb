SUMMARY = "Tools to work with documents in MS Visio file-format"
DESCRIPTION = "This package contains tools to work with documents in MS Visio file-format."
LICENSE = "MPL-2.0"

PV = "0.1.11"

RPM_NAME = "libvisio-tools-0.1.11-1.3.aarch64.rpm"
RPM_HASH = "1c164b0e47fa8a58f3c21cbbf94d034381fd9a846dfb4168d0c9f210a165456784b799d5f2b1c5289b96268d69768811e40cb2ed2a33bca230597ce70d6e2586"

RPROVIDES:${PN} += "libvisio-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libvisio-0.1.so.1"

inherit rpm
