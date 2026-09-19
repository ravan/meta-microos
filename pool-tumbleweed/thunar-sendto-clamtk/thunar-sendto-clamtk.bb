SUMMARY = "Adds a right-click, context menu to scan files or folders in Thunar"
DESCRIPTION = "All this plugin does is copy a desktop file to Thunar's send-to \
directory.  If this seems redundant, that's because it is: \
this plugin depends on clamtk, which already has this directory \
file. So, it stands to reason we should be able to just find that \
file and copy it, rather than having our own copy."
LICENSE = "GPL-1.0-or-later"

PV = "0.08"

RPM_NAME = "thunar-sendto-clamtk-0.08-1.9.noarch.rpm"
RPM_HASH = "e7b1c86e43de5d8905bad4ebd09e02831089035e74a7937bea463bee3df3723de2e08df89279c09ac5978b83bce8c0585a2fa4c407893b40581fa43142caf173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "thunar-sendto-clamtk"

RDEPENDS:${PN} += "clamtk \
thunar"

inherit rpm
