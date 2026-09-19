SUMMARY = "Pure Python Multicast DNS Service Discovery Library (Bonjour/Avahi compatible)"
DESCRIPTION = "This is a fork of pyzeroconf, a Multicast DNS Service Discovery for Python. \
It is compatible with Bonjour and Avahi. \
Compared to some other Zeroconf/Bonjour/Avahi Python packages, python-zeroconf \
is not tied to Bonjour or Avahi, does not use D-Bus and \
does not force you to use a particular event loop or python-twisted."
LICENSE = "LGPL-2.1-or-later"

PV = "0.150.0"

RPM_NAME = "python314-zeroconf-0.150.0-1.2.aarch64.rpm"
RPM_HASH = "1d849b53796798b7c97eac3b4d21ee07d8dcf83b561a5fc0be47e83d1a8849601cf948904525690f5c554d9415347f7ff9fe803fcf0de57f3a99f9fba3078c4c"

RPROVIDES:${PN} += "python3.14dist-zeroconf \
python314-zeroconf \
python3dist-zeroconf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-ifaddr"

inherit rpm
