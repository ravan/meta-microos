SUMMARY = "Python3 API for eduVPN"
DESCRIPTION = "eduVPN client API for Python3"
LICENSE = "GPL-3.0-or-later"

PV = "4.7.2"

RPM_NAME = "python313-eduvpn-client-4.7.2-1.2.noarch.rpm"
RPM_HASH = "cca273cea1662415eb0d364e13497cf66d30a6b2bb3f3ff12d9ead0e1dbdc319aeb2ecd9139f05940bfb0544e417978a987f1b5b2f130ed4020f6784192c75bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-eduvpn-client \
python3.13dist-eduvpn-client \
python313-eduvpn-client \
python3dist-eduvpn-client"

RDEPENDS:${PN} += "-python313-eduvpn-common >= 5.0.2 with python313-eduvpn-common < 6 \
NetworkManager-openvpn \
python-abi \
python313-gobject"

inherit rpm
