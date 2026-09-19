SUMMARY = "Send and receive files via Bluetooth"
DESCRIPTION = "Send and receive files via Bluetooth."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "pantheon-bluetooth-daemon-1.1.0-1.6.aarch64.rpm"
RPM_HASH = "d0b60d8ab66b2d7e158b10df4d506e2336823a50e6553f4aa04aa5a322332967af07eb44bbe00e3489c3ceb4b7eb9c2fd91f9b5a8ab19d189ecbcbafeb6dfacc"

RPROVIDES:${PN} += "pantheon-bluetooth-daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0"

inherit rpm
