SUMMARY = "Development library for codec2"
DESCRIPTION = "Codec 2 is a speech codec designed for communications quality speech \
between 700 and 3200 bit/s."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "codec2-devel-1.2.0-2.8.aarch64.rpm"
RPM_HASH = "28b557b7475dfc2b6070dbdf94d3a8743e63b90e07f21352a149f9d563bcc27f54aba9e434380df178d15967ab41395b09ae2e443760af4d1b007c45e769efb2"

RPROVIDES:${PN} += "cmake-codec2 \
codec2-devel \
pkgconfig-codec2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcodec2-1-2"

inherit rpm
