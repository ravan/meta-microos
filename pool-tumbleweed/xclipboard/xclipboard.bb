SUMMARY = "X clipboard client"
DESCRIPTION = "xclipboard is used to collect and display text selections that are \
sent to the CLIPBOARD by other clients.  It is typically used to save \
CLIPBOARD selections for later use.  It stores each CLIPBOARD \
selection as a separate string, each of which can be selected."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "xclipboard-1.1.6-1.2.aarch64.rpm"
RPM_HASH = "3245d05b604755e860850d31f437a94121a82bb30281ed66ce191a3e46727b57576e6fecedb5d4cd0fa4893c45f37501ee8b9d279efeff05f9f3b34c65607af9"

RPROVIDES:${PN} += "xclipboard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libxkbfile.so.1"

inherit rpm
