SUMMARY = "Command line client for communication over D-Bus"
DESCRIPTION = "Command line client for communication over D-Bus."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde3"

RPM_NAME = "libqt5-qdbus-5.15.19+kde3-1.8.aarch64.rpm"
RPM_HASH = "515974edd58ab898285055a6083081190794fd8159d1d7e7478691eee8e42a9b58a6e68603c5485d3b54809c33b52e0e6f0098698b26f991d02ad493b639ab0e"

RPROVIDES:${PN} += "libqt5-qdbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
