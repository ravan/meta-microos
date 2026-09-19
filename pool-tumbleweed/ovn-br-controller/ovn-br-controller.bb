SUMMARY = "Open Virtual Network local OVS bridge controller"
DESCRIPTION = "ovn-br-controller is OVN logical flow based local controller \
daemon to control and program the Open vSwitch bridges."
LICENSE = "Apache-2.0"

PV = "3.7.1"

RPM_NAME = "ovn-br-controller-3.7.1-37.1.aarch64.rpm"
RPM_HASH = "817ac6f6b537017065c6201669392f9ed17f0a07a8ca73be5d04d9f889917a1dc96e87bbc392bbfbdc38f0962ff7c4648fc3dbf8e8f71068e18c7cda5b5e7457"

RPROVIDES:${PN} += "ovn-br-controller"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.7.so.0 \
libovn-26.03.so.0 \
ovn"

inherit rpm
