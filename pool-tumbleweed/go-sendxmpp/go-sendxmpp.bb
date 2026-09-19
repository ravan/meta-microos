SUMMARY = "A little tool to send messages to an XMPP contact or MUC"
DESCRIPTION = "A little tool to send messages to an XMPP contact or MUC."
LICENSE = "BSD-2-Clause"

PV = "0.17.0"

RPM_NAME = "go-sendxmpp-0.17.0-1.1.aarch64.rpm"
RPM_HASH = "f0c5a0ff42603e5ff776325f244a911d3508117717370dcd88431d996e07c989c9b6fb26d478bf7ca299b501f2aaff0974552147833f89eef3fb58be39437d71"

RPROVIDES:${PN} += "go-sendxmpp"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
