SUMMARY = "Defaults to SUSE Registry on SL Micro"
DESCRIPTION = "Ships a modified registries.conf with registry.suse.com as the only unqualified search registry."
LICENSE = "Apache-2.0"

PV = "20260521"

RPM_NAME = "registries-conf-suse-20260521-1.1.noarch.rpm"
RPM_HASH = "6b28ae90854385dcf4852ac67575f7787ce526916409fc3c4ad87d1d19dd8b84bef3ae2910c15a5caabbdb54f375b93b03aeab10d26cf9e293065de1efe293b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "registries-conf \
registries-conf-suse"

RDEPENDS:${PN} += ""

inherit rpm
