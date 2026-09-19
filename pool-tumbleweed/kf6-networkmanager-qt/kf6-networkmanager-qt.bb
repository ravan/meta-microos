SUMMARY = "A Qt wrapper for NetworkManager DBus API"
DESCRIPTION = "NetworkManagerQt provides access to all NetworkManager features \
exposed on DBus. It allows you to manage your connections and control \
your network devices and also provides a library for parsing connection \
settings which are used in DBus communication."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-networkmanager-qt-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "c2909c8a6dd8d98642c60e7ddffd1b913c21d1c1b1c63896de1e23f4f917b966d3c45ad2a1d7f19dd12120e71224488bc1f9cc25a68bf2595ed40df2fd814f1f"

RPROVIDES:${PN} += "kf6-networkmanager-qt"

RDEPENDS:${PN} += ""

inherit rpm
