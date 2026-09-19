SUMMARY = "Development files for Ghostscript"
DESCRIPTION = "This package contains the development files for Ghostscript."
LICENSE = "AGPL-3.0-only"

PV = "10.07.1"

RPM_NAME = "ghostscript-devel-10.07.1-1.3.aarch64.rpm"
RPM_HASH = "25b20ce5764911c1275362d153dbe5d60857115ad491ec33f7c530b7418498c464b82be99ee3b687cc32eb428950f24dd0cf4e705746c991e51ef1386dd08f92"

RPROVIDES:${PN} += "ghostscript-devel \
pkgconfig-ijs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ghostscript"

inherit rpm
