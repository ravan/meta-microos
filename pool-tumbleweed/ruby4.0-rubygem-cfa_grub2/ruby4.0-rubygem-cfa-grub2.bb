SUMMARY = "Models for GRUB2 configuration files"
DESCRIPTION = "Models allowing easy read and modification of GRUB2 configuration files. It is \
a plugin for cfa framework."
LICENSE = "LGPL-3.0-only"

PV = "2.0.0"

RPM_NAME = "ruby4.0-rubygem-cfa_grub2-2.0.0-1.31.aarch64.rpm"
RPM_HASH = "d7638b3ef54f38388a33f029409ff8e9ca56431ffa1fa14ac915a629c0582858d1681ed339cac1e603d95076c7f0d3158396cb06bdc56381e718b1fe22c00be1"

RPROVIDES:${PN} += "ruby4.0-rubygem-cfa-grub2 \
rubygem-cfa-grub2 \
rubygem-ruby-4.0.0-cfa-grub2 \
rubygem-ruby-4.0.0-cfa-grub2-2 \
rubygem-ruby-4.0.0-cfa-grub2-2.0 \
rubygem-ruby-4.0.0-cfa-grub2-2.0.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-cfa-1"

inherit rpm
