SUMMARY = "Internet Gateway"
DESCRIPTION = "The 32bit pattern complementing gateway_server."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-gateway_server-32bit-20250313-5.2.aarch64.rpm"
RPM_HASH = "77c7dee65aaf61ed9db4bdd90c1894f6782e90e54d89f369f95871fbc11946bbe1aa19b0acfa642231449796565c4441a8de5f490aadcbd3b49d47a1429404c4"

RPROVIDES:${PN} += "pattern- \
patterns-server-gateway-server-32bit"

RDEPENDS:${PN} += ""

inherit rpm
