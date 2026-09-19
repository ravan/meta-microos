SUMMARY = "Common files for libirman"
DESCRIPTION = "Common files for libirman."
LICENSE = "LGPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "irman-common-0.5.2-6.3.noarch.rpm"
RPM_HASH = "cd6b913539491ef0eec6c7d6f022aaa886e08b0e30507de7823d53c1272ca34a426b351f672b8d22a5abc9f60e7aa93f84c3e3900c74d582effe70541ee949b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-irman-common \
irman-common \
libirman-common"

RDEPENDS:${PN} += ""

inherit rpm
