SUMMARY = "The eduVPN desktop client (CLI and GUI front-end)"
DESCRIPTION = "The eduVPN desktop client is a specialized virtual private network (VPN) \
solution designed primarily for the education and research community. It offers \
preconfigured secure and private network connections for students, faculty, and \
researchers at educational institutions, providing several key advantages over \
traditional VPN clients."
LICENSE = "GPL-3.0-or-later"

PV = "4.7.2"

RPM_NAME = "eduvpn-client-4.7.2-1.2.noarch.rpm"
RPM_HASH = "f51787d41f485400a571bd1784daebf3cb6c9e352aac6b52900daf1cc2f4c23008aa6b39dbb14f29563696e1a871783bc3a8ac63b098b4a1ebf586d0b83c59a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eduvpn-client"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
NetworkManager-openvpn \
gtk3 \
python3-eduvpn-client"

inherit rpm
