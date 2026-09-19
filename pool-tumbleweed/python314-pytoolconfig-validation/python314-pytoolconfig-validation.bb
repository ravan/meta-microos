SUMMARY = "[validation] extra for python314-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [validation] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "python314-pytoolconfig-validation-1.3.1-1.11.noarch.rpm"
RPM_HASH = "4d3d6fdc93f5223ede8ee988e399f0a8d068460b40aa82ea9b1b82a2ff6724dec44563fa75fbee56ea1a6327fe63f22895d1f7d07575f1b6377c3f501c657d2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-pytoolconfig-validation"

RDEPENDS:${PN} += "python314-pydantic \
python314-pytoolconfig"

inherit rpm
