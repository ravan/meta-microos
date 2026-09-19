SUMMARY = "Python3 bindings for Open vSwitch"
DESCRIPTION = "This package contains the Python3 bindings for Open vSwitch database."
LICENSE = "Apache-2.0"

PV = "3.7.1"

RPM_NAME = "python3-openvswitch-3.7.1-37.1.aarch64.rpm"
RPM_HASH = "1ebeb40d10ee6de51a59a780742b600273c90c3a28b66863da4d9a9c43b9c35f2d44cc68c758db7381d51756df592174e8dfcb811e4be4c135d1dd6587c21c6f"

RPROVIDES:${PN} += "python3-openvswitch \
python3-ovs \
python3.13dist-ovs \
python3dist-ovs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3-7-0 \
libopenvswitch-3.7.so.0 \
python-abi \
python3 \
python3-sortedcontainers"

inherit rpm
