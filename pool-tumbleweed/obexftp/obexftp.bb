SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) Protocol's File Transfer Feature"
DESCRIPTION = "ObexFTP works with all protocols supported by openobex (OpenOBEX). \
Currently, these are: \
 \
- irda (IrDA), \
- bluez-utils (BlueTooth) \
- setserial (Serial)"
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "obexftp-0.24.2-3.10.aarch64.rpm"
RPM_HASH = "bd2dc2feca7d75f495d961bf40abb0e04f989be551740af062a43b2d0a205622257428359cf57cd18763b18880b45abd89364f201cb2143961a36dcdfd94523e"

RPROVIDES:${PN} += "libbfb.so.1 \
libmulticobex.so.1 \
libobexftp.so.0 \
obexftp"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbluetooth.so.3 \
libc.so.6 \
libopenobex.so.2"

inherit rpm
