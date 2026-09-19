SUMMARY = "Pure Python Multicast DNS Service Discovery Library (Bonjour/Avahi compatible)"
DESCRIPTION = "This is a fork of pyzeroconf, a Multicast DNS Service Discovery for Python. \
It is compatible with Bonjour and Avahi. \
Compared to some other Zeroconf/Bonjour/Avahi Python packages, python-zeroconf \
is not tied to Bonjour or Avahi, does not use D-Bus and \
does not force you to use a particular event loop or python-twisted."
LICENSE = "LGPL-2.1-or-later"

PV = "0.150.0"

RPM_NAME = "python313-zeroconf-0.150.0-1.2.aarch64.rpm"
RPM_HASH = "98424088eaa6662e3db17b23f5a7713ef679b9ef4ac3bebb8bc55dfa124c589c64b34e6998796fac1d57fa1dc04db28b84715127391beac38ffa21d3ba4a1410"

RPROVIDES:${PN} += "python3-zeroconf \
python3.13dist-zeroconf \
python313-zeroconf \
python3dist-zeroconf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-ifaddr"

inherit rpm
