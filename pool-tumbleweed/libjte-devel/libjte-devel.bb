SUMMARY = "Development Files for libjte"
DESCRIPTION = "This package includes development files for libjte."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22"

RPM_NAME = "libjte-devel-1.22-1.21.aarch64.rpm"
RPM_HASH = "0bd849dbd1f92cf5d4cb343de9a6a2fb9808a14c31c7b5fa9b6868d926cc4424235943290f7357c28cb98f16f58a35e8adc295759fa7ebe7f42265e797929f72"

RPROVIDES:${PN} += "libjte-devel \
pkgconfig-libjte-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjte2"

inherit rpm
