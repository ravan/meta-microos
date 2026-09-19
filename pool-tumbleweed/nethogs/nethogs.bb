SUMMARY = "Network Bandwidth Usage Monitor"
DESCRIPTION = "NetHogs is a small 'net top' tool. Instead of breaking the traffic down per \
protocol or per subnet, like most tools do, it groups bandwidth by process. \
NetHogs does not rely on a special kernel module to be loaded. If there's \
suddenly a lot of network traffic, you can fire up NetHogs and immediately see \
which PID is causing this. This makes it easy to indentify programs that have \
gone wild and are suddenly taking up your bandwidth."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.0"

RPM_NAME = "nethogs-0.9.0-1.2.aarch64.rpm"
RPM_HASH = "52d008e32119305bb32c617d4cd23c749dfd0ede62e759cf80be99f4d653ec68d5e6596747e26e5da2821a6602cf68e181b36d94e6ca51f0716db5640ca553f6"

RPROVIDES:${PN} += "nethogs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libpcap.so.1 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
