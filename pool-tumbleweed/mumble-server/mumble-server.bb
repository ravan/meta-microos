SUMMARY = "Voice Communication Server for Gamers"
DESCRIPTION = "Low-latency, high-quality voice communication for gamers. Includes game \
linking, so voice from other players comes from the direction of their \
characters, and has echo cancellation so the sound from your loudspeakers \
won't be audible to other players."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "1.5.915"

RPM_NAME = "mumble-server-1.5.915-1.1.aarch64.rpm"
RPM_HASH = "938b10f290beee20272dc34121791d9d336c81013fd7c7fb737d3914481ab6b9f6e707abf58a1a8ed6a9d20377dddceea60cdea86622e4e98ce4db89872ae586"

RPROVIDES:${PN} += "config-mumble-server \
mumble-server"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libdns-sd.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf.so.34.2.0 \
libssl.so.3 \
libstdc++.so.6 \
lsb-release \
systemd"

inherit rpm
