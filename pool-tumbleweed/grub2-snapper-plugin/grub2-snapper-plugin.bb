SUMMARY = "Grub2's snapper plugin"
DESCRIPTION = "Grub2's snapper plugin for advanced btrfs snapshot boot menu management"
LICENSE = "GPL-3.0-or-later"

PV = "2.14"

RPM_NAME = "grub2-snapper-plugin-2.14-19.1.noarch.rpm"
RPM_HASH = "635f8468e4d70043c81fce9ac585e5ddcff7762890d43a31d3dcc11b87bd0d11b3dca78723155f4545d56f72734a2f47d337af1e0d9f72c07588b89fcdeba2e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grub2-snapper-plugin \
grub2-snapper-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
libxml2-tools"

inherit rpm
