SUMMARY = "Utility to monitor X11/Client conversations"
DESCRIPTION = "XSCOPE is a program to monitor the connections between the X11 window \
server and a client program."
LICENSE = "MIT"

PV = "1.4.5"

RPM_NAME = "xscope-1.4.5-1.5.aarch64.rpm"
RPM_HASH = "66c3e541bbb4fc27eabc16d703c18fb8136356be54feda8de2dcf33dcf598257e8c88bde18fbd102463c5c674ce32487e057aca1f7d2787cdb7cae9acb41ba62"

RPROVIDES:${PN} += "xscope"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
