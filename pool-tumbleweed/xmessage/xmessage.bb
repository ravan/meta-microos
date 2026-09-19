SUMMARY = "Utility to display a message or query in a window"
DESCRIPTION = "xmessage displays a message or query in a window. The user can click \
on an 'okay' button to dismiss it or can select one of several buttons \
to answer a question. xmessage can also exit after a specified time."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "xmessage-1.0.7-1.9.aarch64.rpm"
RPM_HASH = "a77d3ebede780e5afb60b132595e62a7fef74ed9f6bdd834929536c50578c1b80207c18177205795c6349657a257e7dcc92fdca9b03a008991643009cdd97e33"

RPROVIDES:${PN} += "xmessage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm
