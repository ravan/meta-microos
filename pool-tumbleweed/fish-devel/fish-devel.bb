SUMMARY = "Devel files for the fish shell"
DESCRIPTION = "This package contains development files for the fish shell."
LICENSE = "BSD-3-Clause & GPL-2.0-only & ISC & LGPL-2.0-or-later & MIT & PSF-2.0"

PV = "4.8.1"

RPM_NAME = "fish-devel-4.8.1-1.2.aarch64.rpm"
RPM_HASH = "d427963a38bb1e1e49735810f0e61133118f5349244cd9eea160ad47055bd670b3b403f738d5379e7f850956eee5e7c09cdc9cb50927dfb0ce5c4a0cd0245609"

RPROVIDES:${PN} += "fish-devel \
pkgconfig-fish"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
