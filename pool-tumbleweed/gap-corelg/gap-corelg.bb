SUMMARY = "GAP: computation with real Lie groups"
DESCRIPTION = "The CoReLG package contains functionality for working with real \
semisimple Lie algebras."
LICENSE = "GPL-2.0+"

PV = "1.57"

RPM_NAME = "gap-corelg-1.57-1.6.noarch.rpm"
RPM_HASH = "49e1e6b71aadc3b399089390e080798718656602dccd55e732cad5cfd14578d3c082e3469b68bb83686cd2cd23ed1f098a08085b2e237d1aba27bf1964fd40af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-corelg"

RDEPENDS:${PN} += "gap-core \
gap-sla"

inherit rpm
