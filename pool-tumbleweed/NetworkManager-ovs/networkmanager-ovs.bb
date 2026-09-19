SUMMARY = "Open vSwitch device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for Open vSwitch bridges."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.56.1"

RPM_NAME = "NetworkManager-ovs-1.56.1-4.1.aarch64.rpm"
RPM_HASH = "6dfe8cbb4f8c8e021cb4974f41019646a3ac9b4e0c3d7bee2ede76e50e01c47b7a5cd6cd9b72ac0c6421a22d8b1a59368f6ad8b5d22a80d520865c224c4908f4"

RPROVIDES:${PN} += "NetworkManager-ovs \
libnm-device-plugin-ovs.so"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4 \
openvswitch"

inherit rpm
