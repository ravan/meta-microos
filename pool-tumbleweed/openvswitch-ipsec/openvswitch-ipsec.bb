SUMMARY = "Open vSwitch IPsec tunneling support"
DESCRIPTION = "This package provides IPsec tunneling support for OVS tunnels."
LICENSE = "Apache-2.0"

PV = "3.7.1"

RPM_NAME = "openvswitch-ipsec-3.7.1-37.1.noarch.rpm"
RPM_HASH = "0f529557a5c1ef664bd29815656dc7c2ec54e608de6feb1b38c31c19d28fe8e3c4f151451ad78752451b8622afb11fd80426ec18eba2bdc53ee357238b18f7b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openvswitch-ipsec"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
/usr/sbin/ipsec \
openvswitch \
python3-openvswitch \
strongswan"

inherit rpm
