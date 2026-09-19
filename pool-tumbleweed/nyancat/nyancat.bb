SUMMARY = "The flying rainbow cat rendered in a terminal"
DESCRIPTION = "nyancat is an animated ANSI/xterm-88 color text program that renders a loop of \
the classic Nyan Cat animation. It includes a telnet server."
LICENSE = "NCSA"

PV = "1.5.2"

RPM_NAME = "nyancat-1.5.2-2.17.aarch64.rpm"
RPM_HASH = "5d0082d5ce097488ebc18af9b0036e0ed23a4a9f302f6a7a9b1ceb6701adf22615511a24d8b006791e8e30db7aa51d6ded6780c0ea053a53d47b9e6f91396816"

RPROVIDES:${PN} += "nyancat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
