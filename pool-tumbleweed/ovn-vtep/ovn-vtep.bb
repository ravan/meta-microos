SUMMARY = "Open Virtual Network VTEP controller for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN VTEP (VXLAN Tunnel Endpoint) controller."
LICENSE = "Apache-2.0"

PV = "26.03.2"

RPM_NAME = "ovn-vtep-26.03.2-37.1.aarch64.rpm"
RPM_HASH = "912041e81e65efa8534c9ce35c6186b4ccb1bb932c00a05b08380f7f19b8e9d598d4b39d87040d88dbdb7aae13b9ae58fa0bbea262dde85c07dc52ead189ac83"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn-/usr/bin/ovn-controller-vtep \
openvswitch-ovn-/usr/bin/ovn-controller-vtep \
openvswitch-ovn-vtep \
ovn-vtep"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.7.so.0 \
libovn-26.03.so.0 \
libvtep-3.7.so.0 \
openvswitch \
ovn"

inherit rpm
