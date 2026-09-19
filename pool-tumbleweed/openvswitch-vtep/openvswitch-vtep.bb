SUMMARY = "Open vSwitch VTEP emulator"
DESCRIPTION = "A VTEP (VXLAN Tunnel EndPoint) emulator that uses Open vSwitch for \
forwarding. \
 \
Open vSwitch is a full-featured software-based Ethernet switch."
LICENSE = "Apache-2.0"

PV = "3.7.1"

RPM_NAME = "openvswitch-vtep-3.7.1-37.1.aarch64.rpm"
RPM_HASH = "55ca908341a729824f40ebc2b9ac0a050a4b0d093953ce6d4211f682521be3e8adbbd43d8ab464318d6fbf09fb1631eb4b640582b3ae6cb33b9438302464ff7d"

RPROVIDES:${PN} += "openvswitch-dpdk-vtep \
openvswitch-vtep"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.7.so.0 \
libvtep-3.7.so.0 \
openvswitch \
openvswitch-switch \
python3-openvswitch"

inherit rpm
