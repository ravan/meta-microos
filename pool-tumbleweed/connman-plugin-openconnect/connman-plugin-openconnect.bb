SUMMARY = "OpenConnect plugin for connman"
DESCRIPTION = "Provides OpenConnect support for Connman (Connection Manager). \
OpenConnect is an open client for Cisco(TM) AnyConnect(TM) VPN."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-plugin-openconnect-1.42-2.16.aarch64.rpm"
RPM_HASH = "67df8beb78212a266c473dd3ef8377c0e571890412d163190a9051ebc427c9a007227c47d63ad4d4640bc60ea4240cd4aa13fc3191e5dc2cc2a34a19debe33cf"

RPROVIDES:${PN} += "connman-plugin-openconnect"

RDEPENDS:${PN} += "connman \
dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenconnect.so.5 \
openconnect"

inherit rpm
