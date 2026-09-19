SUMMARY = "Wayland region selector"
DESCRIPTION = "Tool to select a region in a Wayland compositor. \
Meant to be used with a tool called grim."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "slurp-1.6.0-1.5.aarch64.rpm"
RPM_HASH = "f4a0b4ecd9bb553b71c5bae91d1d6ecad8f06afebcdf8154c0dc7d32796d4d2df67162b2459688a68d670e1872a089fc53e67a6c4656d8d4879e277fe1b00830"

RPROVIDES:${PN} += "slurp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0"

inherit rpm
