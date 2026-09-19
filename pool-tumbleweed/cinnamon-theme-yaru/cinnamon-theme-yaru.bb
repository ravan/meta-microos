SUMMARY = "Yaru Cinnamon themes"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub. \
 \
This package contains the cinnamon themes."
LICENSE = "CC-BY-SA-4.0 & GPL-3.0-or-later & LGPL-2.1-only & LGPL-3.0-only"

PV = "24.04.0"

RPM_NAME = "cinnamon-theme-yaru-24.04.0-1.9.noarch.rpm"
RPM_HASH = "4a4ecb33807eec438c6b62c33c1830be5416de737bd8ff35d3782b736312e77a087491eab7c599d78ac3fe16dbb781b9c9ed5d1deeb6ceb6dca8ce0501d7205c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-theme-yaru"

RDEPENDS:${PN} += "cinnamon \
metatheme-yaru-common"

inherit rpm
