SUMMARY = "Network emulator for rapid prototyping of Software Defined Networks (SDN)"
DESCRIPTION = "Mininet emulates a complete network of hosts, links, and switches on a single \
machine. Mininet is useful for interactive development, testing, and demos, especially \
those using OpenFlow and SDN. OpenFlow-based network controllers prototyped in \
Mininet can usually be transferred to hardware with minimal changes for full \
line-rate execution."
LICENSE = "MIT & GPL-2.0-or-later"

PV = "2.3.0"

RPM_NAME = "mininet-2.3.0-1.16.aarch64.rpm"
RPM_HASH = "ff1195a12ea1b82805382770bd56643914bc4ad2b256fb4cee0c161f468f2d1dabbe2a363d7528152d293cdd6dd02ceb60cd28b9c294bac253519ba1f3cfe63e"

RPROVIDES:${PN} += "mininet \
python3.13dist-mininet \
python3dist-mininet"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ethtool \
iperf \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
openvswitch \
python-abi \
socat \
telnet"

inherit rpm
