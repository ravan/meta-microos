SUMMARY = "Python3 API for eduVPN"
DESCRIPTION = "eduVPN client API for Python3"
LICENSE = "GPL-3.0-or-later"

PV = "4.7.2"

RPM_NAME = "python314-eduvpn-client-4.7.2-1.2.noarch.rpm"
RPM_HASH = "bfd0668bc2173c501e58a0268f6968cd09aaf8a178321742cf6c3f423a83b1d4df8b6ec11bc0cba56bbdf67417cc0c6cada2346c5446d3627bbe298c91895bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-eduvpn-client \
python314-eduvpn-client \
python3dist-eduvpn-client"

RDEPENDS:${PN} += "-python314-eduvpn-common >= 5.0.2 with python314-eduvpn-common < 6 \
NetworkManager-openvpn \
python-abi \
python314-gobject"

inherit rpm
