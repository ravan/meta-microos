SUMMARY = "Ethernet settings Python bindings"
DESCRIPTION = "Python bindings for the ethtool kernel interface that allows querying and \
changing of Ethernet interface settings, such as speed, port, autonegotiation, and \
PCI locations."
LICENSE = "GPL-2.0-only"

PV = "0.15"

RPM_NAME = "python313-ethtool-0.15-3.7.aarch64.rpm"
RPM_HASH = "4f282495282aaf0024816c36627e19c768bea3f9e5d9a91e7109c2c7a451272dc2922883470af6d12a44d6414a279e8b0c95f81696190802feb83d5dc74dd3ca"

RPROVIDES:${PN} += "python3-ethtool \
python3.13dist-ethtool \
python313-ethtool \
python3dist-ethtool"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200 \
python-abi \
update-alternatives"

inherit rpm
