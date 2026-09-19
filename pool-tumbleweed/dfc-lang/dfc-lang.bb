SUMMARY = "Translations for package dfc"
DESCRIPTION = "Provides translations for the 'dfc' package."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "dfc-lang-3.1.1-3.11.noarch.rpm"
RPM_HASH = "551aab837d72733fcd05f5ec6c4f4ff9991f84e92177948f00ff9e08d843ca1da36d8a9313371c8ae2624997a587c0999876987528c3908b628fc93ef760bd0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dfc-lang \
dfc-lang \
dfc-lang-all \
locale-dfc-fr \
locale-dfc-nl"

RDEPENDS:${PN} += "dfc"

inherit rpm
