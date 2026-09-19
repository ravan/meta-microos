SUMMARY = "Development files for tinygettext"
DESCRIPTION = "This package contains the development files, like headers etc, for tinygettext."
LICENSE = "Zlib"

PV = "0.1.1469459657.bf66a57"

RPM_NAME = "tinygettext-devel-0.1.1469459657.bf66a57-3.5.aarch64.rpm"
RPM_HASH = "4113460dd5e2f51c8c7326092b7675b9173081f7b35ef1c3d79bfdd1db386a907088a8baea62ad8f69083707d528b97e5a92c274e04401575353a0e3dc0d9574"

RPROVIDES:${PN} += "pkgconfig-tinygettext \
tinygettext-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtinygettext0"

inherit rpm
