SUMMARY = "Record or play back a VNC session"
DESCRIPTION = "rfbproxy is a simple proxy for VNC which allows recording of screen \
updates, key presses and mouse events for later replay."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "rfbproxy-1.1.0-53.7.aarch64.rpm"
RPM_HASH = "caa59cd77994a4e6eee48ecc9a13e203ddbe343365e06a9029bb1a07bf9a2fb5aab8c43eb46cf47ac909e652ff9aa7d79eec6fec49a94fcd2fc1382fb5ccf0c6"

RPROVIDES:${PN} += "rfbproxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
