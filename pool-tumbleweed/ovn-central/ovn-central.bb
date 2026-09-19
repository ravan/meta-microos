SUMMARY = "Open Virtual Network support for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN database and northbound daemon."
LICENSE = "Apache-2.0"

PV = "26.03.2"

RPM_NAME = "ovn-central-26.03.2-37.1.aarch64.rpm"
RPM_HASH = "0a7cd2a9b18c0049c05b774d61424a2910c48001d6d472a25516a73c0affaf779151dabd86dec86f07f2f51613b546206c355a87f3a6a0e1d19d84ddc0870993"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn-/usr/bin/ovn-northd \
openvswitch-ovn-/usr/bin/ovn-northd \
openvswitch-ovn-central \
ovn-central"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.7.so.0 \
libovn-26.03.so.0 \
openvswitch \
ovn"

inherit rpm
