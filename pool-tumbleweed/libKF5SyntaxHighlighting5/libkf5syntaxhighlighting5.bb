SUMMARY = "Syntax highlighting engine and library"
DESCRIPTION = "This is a tier1/functional version of the Kate syntax highlighting engine. \
It's not tied to a particular output format or editor engine."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.116.0"

RPM_NAME = "libKF5SyntaxHighlighting5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "3e8fe980bd6f4160858704589504b752e522dfdb208d1c90b3033ad098ae26e8b7c6e368ff8961844321ef892d9e15dac87f7a03a14d097f381b448f00ab055a"

RPROVIDES:${PN} += "libKF5SyntaxHighlighting.so.5 \
libKF5SyntaxHighlighting5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
