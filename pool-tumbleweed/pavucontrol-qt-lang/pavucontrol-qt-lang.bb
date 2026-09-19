SUMMARY = "Translations for package pavucontrol-qt"
DESCRIPTION = "Provides translations for the 'pavucontrol-qt' package."
LICENSE = "GPL-2.0-only"

PV = "2.4.0"

RPM_NAME = "pavucontrol-qt-lang-2.4.0-1.3.noarch.rpm"
RPM_HASH = "44a41c372cb0055226edc8490dd6cdc344eade03085c14e2f06d9aa243e5948937e8ad020e3feac86399de8022d28d398611b99bcae06f9c76ac079eff2e578a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pavucontrol-qt-lang \
pavucontrol-qt-lang-all"

RDEPENDS:${PN} += "pavucontrol-qt"

inherit rpm
