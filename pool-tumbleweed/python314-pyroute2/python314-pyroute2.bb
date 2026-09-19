SUMMARY = "Python Netlink library"
DESCRIPTION = "Pyroute2 is a pure Python netlink library. It requires only Python stdlib, no \
3rd party libraries. The library was started as an RTNL protocol \
implementation, so the name is pyroute2, but now it supports many netlink \
protocols. Some supported netlink families and protocols: \
 \
  * rtnl, network settings --- addresses, routes, traffic controls \
  * nfnetlink --- netfilter API: ipset, nftables, ... \
  * ipq --- simplest userspace packet filtering, iptables QUEUE target \
  * devlink --- manage and monitor devlink-enabled hardware \
  * generic --- generic netlink families \
  * nl80211 --- wireless functions API (basic support) \
  * taskstats --- extended process statistics \
  * acpi_events --- ACPI events monitoring \
  * thermal_events --- thermal events monitoring \
  * VFS_DQUOT --- disk quota events monitoring"
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "0.7.12"

RPM_NAME = "python314-pyroute2-0.7.12-1.10.noarch.rpm"
RPM_HASH = "94c63403be7041819fea1b93cffee5197d0e08cd5301a3fd28939553596566796ba969fe73b1b64e1670c5a2d6c06a382f1d25a03a06dd893ab538694275b3fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyroute2 \
python314-pyroute2 \
python314-pyroute2.core \
python314-pyroute2.ethtool \
python314-pyroute2.ipdb \
python314-pyroute2.ipset \
python314-pyroute2.ndb \
python314-pyroute2.nftables \
python314-pyroute2.nslink \
python3dist-pyroute2"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
python-abi \
update-alternatives"

inherit rpm
