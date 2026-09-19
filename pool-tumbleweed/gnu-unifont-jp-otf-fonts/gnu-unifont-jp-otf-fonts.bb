SUMMARY = "GNU Unifont Japanese (OpenType Format)"
DESCRIPTION = "The GNU Unifont by Roman Czyborra. \
Unifont Japanese OpenType Version."
LICENSE = "GPL-2.0-or-later | OFL-1.1"

PV = "17.0.04"

RPM_NAME = "gnu-unifont-jp-otf-fonts-17.0.04-1.2.noarch.rpm"
RPM_HASH = "1e828866b9ffee896e1e542ae8fca4dcdc6b9fae1c1df358bc0d833701168fda4ac0f36476d93fc1644b88a77b89afa6e1e14ca06fa9e308ebd23a08bd3bf6fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-unifont-jp-otf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
