SUMMARY = "Themes, graphics and icons for LXQt"
DESCRIPTION = "Themes, graphics and icons for LXQt."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-themes-2.4.0-1.2.noarch.rpm"
RPM_HASH = "e8f14f005da7763887253a39e3ca6279ee6af3d8b97d3b44372ad7ff201b646246b33cebc973c1a2e06d525d2a6968b7c144bfdf8cae9dd6793daa7315f99260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-themes"

RDEPENDS:${PN} += ""

inherit rpm
