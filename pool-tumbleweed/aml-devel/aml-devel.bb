SUMMARY = "Development files for aml"
DESCRIPTION = "Development files and headers for aml."
LICENSE = "ISC"

PV = "1.0.0"

RPM_NAME = "aml-devel-1.0.0-1.3.aarch64.rpm"
RPM_HASH = "fe44a1e2a9b1e28c7a40ee0e9f5e2b6c54b5ab9c2a166c884c32b8ba3d54135e5d4fbbb6faaeeac4fd199312eb04679b065a8456e031c2a81aac7a58afd56a22"

RPROVIDES:${PN} += "aml-devel \
pkgconfig-aml1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaml1"

inherit rpm
