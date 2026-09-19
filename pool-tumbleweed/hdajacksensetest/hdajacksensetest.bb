SUMMARY = "Tool to check HD-audio jack/pin status"
DESCRIPTION = "hdajacksensetest is a small program to check the current pin/jack status \
of the HD-audio codec."
LICENSE = "GPL-2.0-or-later"

PV = "0.20141006"

RPM_NAME = "hdajacksensetest-0.20141006-29.4.aarch64.rpm"
RPM_HASH = "a7751f7821f4cc54cd5cce50f671948707f2c6f9e9ac4e1c26553e44c195fca1719aa1d3a750caa83c7864957becfae11453e5f1ce6b1709a2d29e1e8a5b00a1"

RPROVIDES:${PN} += "hdajacksensetest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
