SUMMARY = "Library and Include Files of the PCI utilities"
DESCRIPTION = "This package contains the files that are necessary for software \
development using the PCI utilities."
LICENSE = "GPL-2.0-or-later"

PV = "3.14.0"

RPM_NAME = "pciutils-devel-3.14.0-2.4.aarch64.rpm"
RPM_HASH = "93127944dead650a91d39c8eebc278a3d26c86dbc0b923ad3fe7017ddb637b12061a4465c52f00e4fd369cc0fbb106d178dc43412f7a6a1deb1186ada0b62859"

RPROVIDES:${PN} += "pciutils-devel \
pkgconfig-libpci"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpci3"

inherit rpm
