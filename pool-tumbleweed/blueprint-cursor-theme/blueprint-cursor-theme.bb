SUMMARY = "X Window System Cursors for the Blue Print Theme"
DESCRIPTION = "A nice mouse cursor theme for the X Window System."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.2"

RPM_NAME = "blueprint-cursor-theme-0.0.2-273.7.noarch.rpm"
RPM_HASH = "ee6526d6689e837a2ffd8db2f4e6b4745fea5a537299a2950fb818aadfd8eff39921f69a97c938f677c22253f25bb8c82127a844c2ac941ee744ad96816b3693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blueprint-cursor-theme"

RDEPENDS:${PN} += ""

inherit rpm
