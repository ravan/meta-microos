SUMMARY = "Pygame development package"
DESCRIPTION = "This package contains the header files for developers of Pygame."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-2-Clause & BSD-3-Clause & libpng-2.0"

PV = "2.6.1"

RPM_NAME = "python314-pygame-devel-2.6.1-3.3.aarch64.rpm"
RPM_HASH = "37a474ec84fa91df13ba92fe579a7febb9c3864a5458916c70fa461b9b39b470d1a4c6bdd443f8b7d34e1671155447b6f50726362b8a489176e243f661c60836"

RPROVIDES:${PN} += "python314-pygame-devel"

RDEPENDS:${PN} += "python314-pygame"

inherit rpm
