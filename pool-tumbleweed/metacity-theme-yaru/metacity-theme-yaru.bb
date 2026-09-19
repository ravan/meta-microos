SUMMARY = "Yaru Metacity themes"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub. \
 \
This package contains the metacity themes."
LICENSE = "CC-BY-SA-4.0 & GPL-3.0-or-later & LGPL-2.1-only & LGPL-3.0-only"

PV = "24.04.0"

RPM_NAME = "metacity-theme-yaru-24.04.0-1.9.noarch.rpm"
RPM_HASH = "8200f6e9f0e9200f8ba3a753277308c7fbd2d8273a1eea8cf579b18f49ffd48982862a45537169267a1c2fff9c787f1bef342d14f8129de53d78c64d14db0a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metacity-theme-yaru"

RDEPENDS:${PN} += "metacity \
metatheme-yaru-common"

inherit rpm
