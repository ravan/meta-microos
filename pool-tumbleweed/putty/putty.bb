SUMMARY = "SSH client with optional GTK-based terminal emulator frontend"
DESCRIPTION = "PuTTY is a suite of terminal emulator application and client for \
serial consoles, raw TCP connections, and the computing protocols \
SSH, Telnet and rlogin. \
 \
The 'pterm' program is just the graphical terminal emulator similar \
to xterm, 'plink' is just the (console-based) SSH client similar to \
openssh, and 'putty' is the program that combines both in one."
LICENSE = "MIT"

PV = "0.85"

RPM_NAME = "putty-0.85-1.1.aarch64.rpm"
RPM_HASH = "713456de21290e18c29d17b27a57571a0cefe57762c462ac6d3baffd8f45b6200ca22867f97d9286ba7df7f5edd86ef946671244901829dfb848086e38acbd05"

RPROVIDES:${PN} += "putty"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrender.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
