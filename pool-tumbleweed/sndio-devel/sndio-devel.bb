SUMMARY = "Library Developer Files for sndio"
DESCRIPTION = "This package contains files needed for development with the sndio \
library."
LICENSE = "ISC"

PV = "1.10.0"

RPM_NAME = "sndio-devel-1.10.0-1.5.aarch64.rpm"
RPM_HASH = "9de74d5604bb934e145bd5fe466e79f14faebcad796926977c8f8fb94fd62c9785d10fa3c1ce8e1830f84ab3167a0eb5a5393c9654827910bf5e82ea7bdd7d50"

RPROVIDES:${PN} += "pkgconfig-sndio \
sndio-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsndio7"

inherit rpm
