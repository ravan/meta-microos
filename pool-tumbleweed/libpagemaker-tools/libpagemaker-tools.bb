SUMMARY = "Tools to transform Adobe PageMaker documents into other formats"
DESCRIPTION = "Tools to transform Adobe PageMaker documents into other formats. \
Currently supported: SVG, raw."
LICENSE = "MPL-2.0"

PV = "0.0.4"

RPM_NAME = "libpagemaker-tools-0.0.4-1.40.aarch64.rpm"
RPM_HASH = "cd2d074bc93cb87354665c8739ee915d6489afccb12dfeae2c09880af4c00dd07d54bc37b76ae3be6a16f33aae92ac287bce836d5ceee42f251b71a51f9880a9"

RPROVIDES:${PN} += "libpagemaker-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpagemaker-0.0.so.0 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6"

inherit rpm
