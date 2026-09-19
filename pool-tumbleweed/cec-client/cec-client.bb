SUMMARY = "Control your device with your TV remote control via HDMI"
DESCRIPTION = "In combination with the right hardware, libcec allows to control \
a device with a TV remote control utilizing existing HDMI \
cabling. \
 \
libCEC is an enabling platform for the CEC bus in HDMI, it allows \
developers to interact with other HDMI devices without having to \
worry about the communication overhead, handshaking, and the various \
ways of sending a message for each vendor. \
 \
This package contains the client applications."
LICENSE = "GPL-2.0-or-later"

PV = "8.1.7"

RPM_NAME = "cec-client-8.1.7-1.1.aarch64.rpm"
RPM_HASH = "c5bfeecc34b4fa21157ce65159e32a72985b742693f486f34c22fe1d37d9e57f2333a9ffce8682363d73c803eab648f81059a3c9a31f63f6b2b48f9787f74c90"

RPROVIDES:${PN} += "cec-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcec8 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
