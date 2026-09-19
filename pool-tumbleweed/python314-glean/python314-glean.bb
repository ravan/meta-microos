SUMMARY = "Program to write static config from config-drive"
DESCRIPTION = "Glean is a program intended to configure a system based on configuration \
provided in a configuration drive. \
Different cloud providers have different ways of providing networking and \
other configuration to guest virtual-machines. Many use DHCP but others, \
notably Rackspace, use configuration provided via a configuration drive."
LICENSE = "Apache-2.0"

PV = "1.25.1"

RPM_NAME = "python314-glean-1.25.1-1.3.noarch.rpm"
RPM_HASH = "7b362b31e8f7251fe670cdb91a6344f959fd722544dd523dbaac910a99d43f068a4f3d9b9f8eaeb345bf77ae6803ea9fc039bc77cf815b9247aa859088acdfd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-glean \
python314-glean \
python3dist-glean"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
