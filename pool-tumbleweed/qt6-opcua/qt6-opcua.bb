SUMMARY = "Qt wrapper for existing OPC UA stacks"
DESCRIPTION = "Qt API to interact with OPC UA (Open Platform Communications Unified \
Architecture) on top of a 3rd party OPC UA stack."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-only) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-opcua-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ff04657965c746b1ac762b92c45b3a79e1b8dbc4bc14a02488054d8a485dd9b19d183df301df4a32abb3aeb56d76281dec08eac940fd3050dcdd9a903a0d188e"

RPROVIDES:${PN} += "libopen62541-backend.so \
qt6-opcua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6OpcUa.so.6 \
libc.so.6 \
libcrypto.so.3 \
libstdc++.so.6"

inherit rpm
