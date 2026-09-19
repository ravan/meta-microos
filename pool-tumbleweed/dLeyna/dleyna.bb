SUMMARY = "Services and D-Bus APIs to access UPnP and DLNA media devices in a network"
DESCRIPTION = "dLeyna is a set of services and D-Bus APIs that aim to simplify \
access to UPnP and DLNA media devices in a network."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.5"

RPM_NAME = "dLeyna-0.8.5-1.1.aarch64.rpm"
RPM_HASH = "d99e4c98490bc1ca3b0d37226f2474ce9f9741e64d19da011e5418169baa042e75c2e135c7f432f64899ac633700f8763f5ffef7a6b8a715fea980e0221e4a98"

RPROVIDES:${PN} += "config-dLeyna \
dLeyna \
dbus-com.intel.dleyna-renderer \
dbus-com.intel.dleyna-server \
dleyna-connector-dbus \
dleyna-core \
dleyna-renderer \
dleyna-server \
libdleyna-connector-dbus.so \
libdleyna-core-1-0-6 \
libdleyna-core-1.0.so.6 \
libdleyna-renderer-1.0.so.1 \
libdleyna-server-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgssdp-1.6.so.0 \
libgupnp-1.6.so.0 \
libgupnp-av-1.0.so.3 \
libgupnp-dlna-2.0.so.4 \
libsoup-3.0.so.0 \
libxml2.so.16 \
python-abi"

inherit rpm
