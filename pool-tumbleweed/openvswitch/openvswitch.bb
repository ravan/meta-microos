SUMMARY = "A multilayer virtual network switch"
DESCRIPTION = "Open vSwitch is a multilayer virtual network Ethernet switch. It is \
enables network automation through programmatic extension, and \
supports standard management interfaces and protocols (e.g. NetFlow, \
sFlow, RSPAN, ERSPAN, CLI, LACP, 802.1ag). In addition, it supports \
distribution across multiple physical servers similar to VMware’s \
vNetwork distributed vswitch or Cisco’s Nexus 1000V."
LICENSE = "Apache-2.0 & LGPL-2.1-only & SISSL"

PV = "3.7.1"

RPM_NAME = "openvswitch-3.7.1-37.1.aarch64.rpm"
RPM_HASH = "d4cc9fc03330577157313dfb3e38258095634de18404f4022a7fd00a2f057188e4c81b42fc66a7aa4c12315e79f9b7471d8787d0fe81453025da5c29eecdf21d"

RPROVIDES:${PN} += "config-openvswitch \
group-openvswitch \
openvswitch \
openvswitch-common \
openvswitch-controller \
openvswitch-dpdk \
openvswitch-dpdk-switch \
openvswitch-switch \
user-openvswitch"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libofproto-3.7.so.0 \
libopenvswitch-3.7.so.0 \
libovsdb-3.7.so.0 \
modutils \
python3-click \
python3-netaddr \
python3-openvswitch \
python3-pyparsing \
python3-rich \
shadow \
sysuser-shadow \
util-linux"

inherit rpm
