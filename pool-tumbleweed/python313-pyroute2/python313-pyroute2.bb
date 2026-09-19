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

RPM_NAME = "python313-pyroute2-0.7.12-1.10.noarch.rpm"
RPM_HASH = "763376a20997cd8bb5bd87cf963eb8eafed969d18837abd2ece7871af251103132bfc13b9cd3a1e1f16b08f47985550eded86d8b624fca4c1c4ab9f78862b789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyroute2 \
python3-pyroute2.core \
python3-pyroute2.ethtool \
python3-pyroute2.ipdb \
python3-pyroute2.ipset \
python3-pyroute2.ndb \
python3-pyroute2.nftables \
python3-pyroute2.nslink \
python3.13dist-pyroute2 \
python313-pyroute2 \
python313-pyroute2.core \
python313-pyroute2.ethtool \
python313-pyroute2.ipdb \
python313-pyroute2.ipset \
python313-pyroute2.ndb \
python313-pyroute2.nftables \
python313-pyroute2.nslink \
python3dist-pyroute2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
update-alternatives"

inherit rpm
