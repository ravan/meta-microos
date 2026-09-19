SUMMARY = "Development files for libpwaccess"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that needs to communicate with the \
pwaccess and pwupd services."
LICENSE = "GPL-2.0-or-later & BSD-2-Clause & LGPL-2.1-or-later"

PV = "1.4.0+git20260717.3914e08"

RPM_NAME = "account-utils-devel-1.4.0+git20260717.3914e08-2.1.aarch64.rpm"
RPM_HASH = "41529264b329499de8bdfe04ed9f4b1e73fcac3b0dec91f105a2f27ed1e68932c06b08f1298e5d4ba6b42b68c8bd5822c7c12e733b6141135c6a2c8fe22dd196"

RPROVIDES:${PN} += "account-utils-devel \
pkgconfig-libpwaccess"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpwaccess0"

inherit rpm
