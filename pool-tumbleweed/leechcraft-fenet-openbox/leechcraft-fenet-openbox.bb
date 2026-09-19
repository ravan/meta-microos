SUMMARY = "OpenBox Window Manager integration for LeechCraft"
DESCRIPTION = "This package allows to start Leechcraft as a Desktop Environment with \
the Openbox Window Manager."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-fenet-openbox-0.6.70+git.18808.g3467692359-3.1.noarch.rpm"
RPM_HASH = "b5426e8f1864a8c119a7a59b925f042c689469367fc588b66f7a02374a0c0487e16de1f72b5db3d8fc7d305a1d9b5f767cbbb30969c95b5b3cca65c840d2e137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-fenet-openbox \
leechcraft-fenet-wm"

RDEPENDS:${PN} += "/usr/bin/sh \
leechcraft-fenet \
openbox"

inherit rpm
