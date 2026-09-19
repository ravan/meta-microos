SUMMARY = "Extra support utils for NFS"
DESCRIPTION = "This package contains optional utilities for the client and kernel based \
server."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.2"

RPM_NAME = "nfs-tools-extra-2.9.2-55.1.aarch64.rpm"
RPM_HASH = "655477aebb9ffeae96b0aea2d704f396afeb00874fc648f695e3124649d81f6aa17f41eae51ede644daca548bc8c004c57269016d4ec5eefcbac4cd8cd5f542c"

RPROVIDES:${PN} += "nfs-tools-extra"

RDEPENDS:${PN} += "python3-PyYAML"

inherit rpm
