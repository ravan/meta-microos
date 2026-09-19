SUMMARY = "Open Virtual Network support for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN host controller."
LICENSE = "Apache-2.0"

PV = "26.03.2"

RPM_NAME = "ovn-host-26.03.2-37.1.aarch64.rpm"
RPM_HASH = "91b31f6b2e55112142ee7319506e34f14dede8728c3cfb07feccbd4fa3cfbffb3482a292f91a4c1ba8330abd11bda9e655e002e7737a78ee40de5da2e331c487"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn-/usr/bin/ovn-controller \
openvswitch-ovn-/usr/bin/ovn-controller \
openvswitch-ovn-host \
ovn-host"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.7.so.0 \
libovn-26.03.so.0 \
openvswitch \
ovn"

inherit rpm
