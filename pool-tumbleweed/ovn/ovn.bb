SUMMARY = "Open Virtual Network diagnostic utilities"
DESCRIPTION = "OVN, the Open Virtual Network, is a system to support virtual network \
abstraction.  OVN complements the existing capabilities of OVS to add \
native support for virtual network abstractions, such as virtual L2 and L3 \
overlays and security groups."
LICENSE = "Apache-2.0"

PV = "26.03.2"

RPM_NAME = "ovn-26.03.2-37.1.aarch64.rpm"
RPM_HASH = "1ac2990d3929a43fadabd7313bdf5ebe931b2e8bf4260af7ea63f388b957df5d7340622ef5775e11efdbce14d2d9316b74d20fdd50d5cdbc12010ce355768cc4"

RPROVIDES:${PN} += "config-ovn \
openvswitch-dpdk-ovn \
openvswitch-ovn \
openvswitch-ovn-common \
ovn"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
group-openvswitch \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.7.so.0 \
libovn-26.03.so.0 \
openvswitch \
user-openvswitch"

inherit rpm
