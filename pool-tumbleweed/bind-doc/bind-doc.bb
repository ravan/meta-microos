SUMMARY = "BIND documentation"
DESCRIPTION = "Documentation of the Berkeley Internet Name Domain (BIND) Domain Name \
System implementation of the Domain Name System (DNS) protocols.  This \
includes also the BIND Administrator Reference Manual (ARM)."
LICENSE = "MPL-2.0"

PV = "9.20.26"

RPM_NAME = "bind-doc-9.20.26-1.2.noarch.rpm"
RPM_HASH = "308937c072b4d611c6a4215ac942515373a923e6f2f91ca0cfd471172bbed15d11a55bba086d52e38aeb24c849e1e7acb020cb2b215b6bef1bbac65b4ef9f049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bind-doc"

RDEPENDS:${PN} += ""

inherit rpm
