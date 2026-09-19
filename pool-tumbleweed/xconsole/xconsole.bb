SUMMARY = "Utility to monitor system console messages with X"
DESCRIPTION = "xconsole displays in a X11 window the messages which are usually sent \
to /dev/console"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "xconsole-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "0376857c4023163663116e60084a5de3c53f681ccedd5f2780102ec8f7c32e64ef8b193fc75235fd47935917930d1395278efb98e8923e2b3b260455eec95441"

RPROVIDES:${PN} += "xconsole"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
