SUMMARY = "WireGuard plugin for connman"
DESCRIPTION = "Provides WireGuard network support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-plugin-wireguard-1.42-2.16.aarch64.rpm"
RPM_HASH = "4f83ce94a1c911ef0fb9d0189fec12af5f21311136bd14f06bd8e340fc8e2ae70284e16d185fda6fe17cf559b8185e37f4237e60771f360f201eee847b939bbe"

RPROVIDES:${PN} += "connman-plugin-wireguard"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
