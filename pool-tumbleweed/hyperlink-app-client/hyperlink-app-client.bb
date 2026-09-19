SUMMARY = "Handler program for the app protocol"
DESCRIPTION = "The app protocol defines the behaviour of a terminal emulator when opening a \
'app://' hyperlink. \
 \
The behaviour is basically to send via TCP/IP the given command to the given \
hostname and port. \
 \
This behaviour can be extracted in a separate program. A terminal emulator \
can simply invoke this program, passing it the URI on standard input. This way, \
the protocol logic does not need to be hardwired into any terminal emulator. \
 \
This package contains the reference implementation of such a handler program."
LICENSE = "GPL-3.0-or-later"

PV = "0.0~git5.211516e"

RPM_NAME = "hyperlink-app-client-0.0~git5.211516e-1.13.aarch64.rpm"
RPM_HASH = "7e6fc3753972d50e35ffbce9d62c23a15de98e92eb4f19e4e79ae7954bca21cc789e1ea8fafe3ae5f2c84cd3fd3348bc02f6da0e2a6dc487522e9b4a29662b85"

RPROVIDES:${PN} += "hyperlink-app-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
