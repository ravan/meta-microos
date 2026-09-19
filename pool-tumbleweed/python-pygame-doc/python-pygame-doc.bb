SUMMARY = "Pygame documentation and example programs"
DESCRIPTION = "This package contains documentation and example programs for Pygame."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-2-Clause & BSD-3-Clause & libpng-2.0"

PV = "2.6.1"

RPM_NAME = "python-pygame-doc-2.6.1-3.3.aarch64.rpm"
RPM_HASH = "4794df6f2cd5d9c3be5af4ec24e3bc2e5fe495f49cded0efbebcd1c5c3e31b7a9d9d0c0033cf998c85e68033a2d6314b12b7c2effe5f21447ca8f20e4739c801"

RPROVIDES:${PN} += "pygame-doc \
python-pygame-doc \
python313-pygame-doc \
python314-pygame-doc"

RDEPENDS:${PN} += ""

inherit rpm
