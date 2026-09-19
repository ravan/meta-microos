SUMMARY = "5250 Emulator"
DESCRIPTION = "The 5250 is most commonly used for connecting to IBM's AS/400.	While \
one can connect to an AS/400 with a VT100 emulator, it is not ideal. \
The problem is that the 5250 is a screen at a time terminal, whereas \
the VT100 is a character at a time device.  The emulator uses telnet's \
binary mode to transfer the 5250 data stream."
LICENSE = "LGPL-2.1-or-later"

PV = "0.18.0"

RPM_NAME = "tn5250-0.18.0-1.4.aarch64.rpm"
RPM_HASH = "c3c9431a32cb898e5f093366037dddce13b73a86444a898863b6e4fe3e79155c670f46b2c4c820fc15254ddcf8fee5550f0d69c2684569664bf9e339970b4ac9"

RPROVIDES:${PN} += "tn5250"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
lib5250.so.0 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
