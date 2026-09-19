SUMMARY = "Additional Plasma Wallpapers"
DESCRIPTION = "Additional wallpapers for Plasma Workspace."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-workspace-wallpapers-6.7.5-1.1.noarch.rpm"
RPM_HASH = "2a59aaf173b69ad181dff0b92c037e17160d2d14645c8eb7e6d2ac632c2e0d87925a79f44d91d792e48c115613197a2ff84488f24b53ab503fb1269c4f0f316f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma5-workspace-wallpapers \
plasma6-workspace-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
