SUMMARY = "Development files for libmirisdr"
DESCRIPTION = "Library headers and other development files for the mirisdr driver."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "libmirisdr-devel-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "4cd183c2c13f79036024c338dc4dffe89a22112d37b3a384bb07a097bd07d1c097d545af12f729d5b2d275d69fba39537530f0cc51ab2830b39dd283c95a511f"

RPROVIDES:${PN} += "libmirisdr-devel \
pkgconfig-libmirisdr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmirisdr4"

inherit rpm
