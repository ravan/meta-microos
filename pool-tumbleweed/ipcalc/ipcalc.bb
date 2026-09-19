SUMMARY = "IPv4/IPv6 tool assisting in network calculations on the command line"
DESCRIPTION = "ipcalc is a modern tool to assist in network address calculations for IPv4 and \
IPv6. It acts both as a tool to output human readable information about a \
network or address, as well as a tool suitable to be used by scripts or other \
programs.  It supports printing a summary about the provided network address, \
multiple command line options per information to be printed, transparent IPv6 \
support, and in addition it will use libGeoIP if available to provide \
geographic information."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "ipcalc-1.0.3-2.8.aarch64.rpm"
RPM_HASH = "9c992393f339a7474c9c2a5656dab05f8fd26a660f231f11b7b8412c3a22562c8d19ae9b9d5ebde29342cdc232718989a8ebac0fa482ff6155ef176e68b665e9"

RPROVIDES:${PN} += "ipcalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
