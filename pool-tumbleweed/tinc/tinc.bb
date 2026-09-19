SUMMARY = "A virtual private network daemon"
DESCRIPTION = "tinc is a Virtual Private Network (VPN) daemon that uses tunnelling \
and encryption to create a secure private network between hosts on \
the Internet. Because the tunnel appears to the IP level network \
code as a normal network device, there is no need to adapt any \
existing software. This tunnelling allows VPN sites to share \
information with each other over the Internet without exposing any \
information to others."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.37"

RPM_NAME = "tinc-1.0.37-1.3.aarch64.rpm"
RPM_HASH = "49862b14d06f739448abd89aa36e1efe0f12ac1c4d8881f3e67cf824306d7e1c53d3c347fc087d2b9cc87af0db8166ea7926bb6dc0ec248cbf5e21769e51aa65"

RPROVIDES:${PN} += "tinc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzo2.so.2 \
libz.so.1"

inherit rpm
