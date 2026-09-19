SUMMARY = "A set of tools for the opus audio codec"
DESCRIPTION = "The Opus codec is designed for interactive speech and audio transmission over \
the Internet. It is designed by the IETF Codec Working Group and incorporates \
technology from Skype's SILK codec and Xiph.Org's CELT codec. \
 \
This is a set of tools for the opus codec."
LICENSE = "BSD-2-Clause & GPL-2.0-only"

PV = "0.2"

RPM_NAME = "opus-tools-0.2-1.34.aarch64.rpm"
RPM_HASH = "b4ca7558cb4eb2620585fe7f57a2c89a6fc6efac9bc98ffb1b9a09c8784be8129fd9925b634e268473d83ae792ccf35d01ee9aaf81440ab59055c5cb9ee0c733"

RPROVIDES:${PN} += "opus-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.14 \
libc.so.6 \
libm.so.6 \
libogg.so.0 \
libopus.so.0 \
libopusenc.so.0 \
libopusfile.so.0 \
libopusurl.so.0"

inherit rpm
