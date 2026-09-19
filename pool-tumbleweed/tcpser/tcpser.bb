SUMMARY = "Serial to IP modem emulation program"
DESCRIPTION = "TCPSER turns a PC serial port into an emulated Hayes compatible modem \
that uses TCP/IP for incoming and outgoing connections. It can be \
used to allow older applications and systems designed for modem use \
to operate on the Internet. TCPSER supports all standard Hayes \
commands, and understands extended and vendor proprietary commands \
(though it does not implement many of them). \
TCPSER can be used for both inbound and outbound connections. \
 \
The original source code can be found here: \
http://www.jbrain.com/pub/linux/serial/ \
This forks changes are based upon the rc12 archive dated 11Mar09. \
The author also fixed the bug with being unable to connect to real \
telnet servers."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.4"

RPM_NAME = "tcpser-1.1.4-1.3.aarch64.rpm"
RPM_HASH = "d7a75ffbe0250438f00522d9bd8e4b95059477205283e11051684b3da3498d09fdabc1d33f395ca563e6daa4e82f1c9f9ba3743f35741ae72e02ac4d6f1cfc7a"

RPROVIDES:${PN} += "tcpser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
