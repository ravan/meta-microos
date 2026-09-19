SUMMARY = "Hardware identification and configuration data"
DESCRIPTION = "hwdata contains various hardware identification and configuration data, \
such as the pci.ids and usb.ids databases."
LICENSE = "GPL-2.0-or-later"

PV = "0.411"

RPM_NAME = "hwdata-0.411-1.1.noarch.rpm"
RPM_HASH = "a0ff415ae0f168e35ceeb77c605be50a1d14ed8b3b5e154162feeab74b5455e11e6ae8bef7bbdc2c8c6f2572ab422fcae9f2af7ae34026173ed5a85cdff768e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hwdata \
pciutils-ids \
pkgconfig-hwdata"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/pkg-config \
/usr/bin/sh \
coreutils \
perl"

inherit rpm
