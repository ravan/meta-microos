SUMMARY = "Internet Gateway"
DESCRIPTION = "Software to set up a proxy, firewall, and gateway server, including a virtual private network (VPN) gateway."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-gateway_server-20250313-5.2.aarch64.rpm"
RPM_HASH = "44bb91acad3b6569deacc6965e3a56fb7f72d63986e3ca767e66e030e30ae106cc9b5b88e144a88cee6d810264f3eabcc5b42f652acf661c4a5dc1b65f1a2f7c"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-gateway-server \
patterns-server-gateway-server"

RDEPENDS:${PN} += "pattern-"

inherit rpm
