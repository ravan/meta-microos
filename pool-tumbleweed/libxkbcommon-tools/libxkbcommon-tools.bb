SUMMARY = "Utilities from xkbcommon"
DESCRIPTION = "xkbcommon tools for introspection and debugging."
LICENSE = "MIT"

PV = "1.13.2"

RPM_NAME = "libxkbcommon-tools-1.13.2-1.3.aarch64.rpm"
RPM_HASH = "4038130b8ffafdeb0a8bcddfdf90816d311d15fe0a366edd61a668aade720ab7bed7cdbb5016c40e732c37304b5fa2fd9513c520a5acf8fa328097866924f4c7"

RPROVIDES:${PN} += "libxkbcommon-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libxkbregistry.so.0"

inherit rpm
