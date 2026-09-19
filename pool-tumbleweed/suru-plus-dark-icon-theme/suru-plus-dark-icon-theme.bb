SUMMARY = "Suru Plus Dark icon theme"
DESCRIPTION = "A cyberpunkish, elegant, futuristic, Papirus-like icon theme."
LICENSE = "GPL-3.0-or-later"

PV = "25.1"

RPM_NAME = "suru-plus-dark-icon-theme-25.1-2.14.noarch.rpm"
RPM_HASH = "84512f2051f7bc6bf37b7bb25fe31d270b7872f2ab25c11552f6862b7130053e1c71b595566332e8b73fbb9f24a73db334909c48b3fba93e94266b33953d6299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "suru-plus-dark-icon-theme"

RDEPENDS:${PN} += ""

inherit rpm
