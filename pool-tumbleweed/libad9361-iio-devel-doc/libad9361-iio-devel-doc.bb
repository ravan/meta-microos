SUMMARY = "Documentation for libad9361-iio"
DESCRIPTION = "Documentation for libad9361-iio library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "libad9361-iio-devel-doc-0.4.0-1.1.noarch.rpm"
RPM_HASH = "b8e51ec144dfbff506e6ea17d9581992dfd866a931b5746ab282355005a588266f8f2e58fc9a6e2bc7151c73032a2193dd0f3286ec4aaca8b0aa6f815384512d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libad9361-iio-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
