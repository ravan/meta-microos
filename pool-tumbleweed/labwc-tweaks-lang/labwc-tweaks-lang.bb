SUMMARY = "Translations for package labwc-tweaks"
DESCRIPTION = "Provides translations for the 'labwc-tweaks' package."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.1.0"

RPM_NAME = "labwc-tweaks-lang-0.1.0-1.2.noarch.rpm"
RPM_HASH = "8883e031733cdb673484659dc1ff4f9be751fa08c5557fe62bb8feb75b2e82aae3b1dbc12eeb2adef5748e6fcc58197f39b3d10bdddbc2196b720ef976a02c9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "labwc-tweaks-lang \
labwc-tweaks-lang-all"

RDEPENDS:${PN} += "labwc-tweaks"

inherit rpm
