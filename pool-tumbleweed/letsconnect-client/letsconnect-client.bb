SUMMARY = "Let's Connect! desktop client"
DESCRIPTION = "The 'Let's Connect!' desktop client is an open source VPN solution that enables \
ISPs, hosters and companies to easily set up a secure VPN service. The project \
is known under two names: 'Let’s Connect!' and eduVPN. The brand eduVPN is used \
to promote this VPN solution to international educational and research \
organizations."
LICENSE = "GPL-3.0-or-later"

PV = "4.7.2"

RPM_NAME = "letsconnect-client-4.7.2-1.2.noarch.rpm"
RPM_HASH = "b00ee3fa9e5a3610201a4a12c733bf80f0515aa810f6e8535fd8d4b9b9161e8c7daa8148b6c906ea3bc07eef76c4c88223685dc339d87cbc1448c0149efec901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "letsconnect-client"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gtk3 \
python3-eduvpn-client"

inherit rpm
