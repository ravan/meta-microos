SUMMARY = "TCL support for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the Tcl extension to ZNC."
LICENSE = "Apache-2.0"

PV = "1.10.3"

RPM_NAME = "znc-tcl-1.10.3-1.1.aarch64.rpm"
RPM_HASH = "02e15680bbe25f6de25bb1fb6cf1f1bb23f498b3e836b5c94433a3bedb14a77522e4036435923cadfbefef9d1ccad5336cd7108d8e8d7420cdc1a485a33cd1b7"

RPROVIDES:${PN} += "znc-tcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtcl8.6.so \
tcl \
znc"

inherit rpm
