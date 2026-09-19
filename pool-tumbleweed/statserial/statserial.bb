SUMMARY = "Helps to Debug Serial Lines"
DESCRIPTION = "Statserial displays a table of the signals on a standard 9-pin or \
25-pin serial port and indicates the status of the handshaking lines. \
It can be useful for debugging problems with serial ports or modems."
LICENSE = "GPL-2.0+"

PV = "1.1"

RPM_NAME = "statserial-1.1-743.9.aarch64.rpm"
RPM_HASH = "61fbf95c48b09ee6c83af34e5ed03336b0e60d07aa3b86e6333bbae81147734c1cc22d3aa8f183e898133c5e015ddcf7ad0dca108919b163553a2a49f50e5d59"

RPROVIDES:${PN} += "statserial"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
