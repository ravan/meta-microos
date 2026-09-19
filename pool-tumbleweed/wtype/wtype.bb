SUMMARY = "Xdotool type for Wayland"
DESCRIPTION = "xdotool type for Wayland."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "wtype-0.4-1.15.aarch64.rpm"
RPM_HASH = "baf3babc40ae276641ddc32a4b38c9e7758d2a714d6fcf8e9225794884db0065c0fab09e79d08924ed5b747dccd607e2a6ddeadb44defbc494a206c003bbdcf6"

RPROVIDES:${PN} += "wtype"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
