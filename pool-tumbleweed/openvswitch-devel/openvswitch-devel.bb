SUMMARY = "Development files for Open vSwitch"
DESCRIPTION = "Devel libraries and headers for Open vSwitch."
LICENSE = "Apache-2.0"

PV = "3.7.1"

RPM_NAME = "openvswitch-devel-3.7.1-37.1.aarch64.rpm"
RPM_HASH = "8ad689d801e9e0afb5a4d3049a9c54f0b72d2f554197f1590ef14468f03d0300c0247b5dfa2e8827be95d2adc4381e9b3b46ab6d453559fc70f752605adc3b29"

RPROVIDES:${PN} += "openvswitch-devel \
openvswitch-dpdk-devel \
pkgconfig-libofproto \
pkgconfig-libopenvswitch \
pkgconfig-libovsdb \
pkgconfig-libsflow"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
/usr/bin/python3.13 \
libopenvswitch-3-7-0 \
python3-openvswitch"

inherit rpm
