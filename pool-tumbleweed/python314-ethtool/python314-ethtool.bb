SUMMARY = "Ethernet settings Python bindings"
DESCRIPTION = "Python bindings for the ethtool kernel interface that allows querying and \
changing of Ethernet interface settings, such as speed, port, autonegotiation, and \
PCI locations."
LICENSE = "GPL-2.0-only"

PV = "0.15"

RPM_NAME = "python314-ethtool-0.15-3.7.aarch64.rpm"
RPM_HASH = "5c6fbfd3e16b7033941572a908525f6212c87b460b63483181f855739aff6f67e7a0a30f3996d2babc2ddc448e6a2da1f8aa5bbdced29ae185c901a7c0016047"

RPROVIDES:${PN} += "python3.14dist-ethtool \
python314-ethtool \
python3dist-ethtool"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-route-3.so.200 \
python-abi \
update-alternatives"

inherit rpm
