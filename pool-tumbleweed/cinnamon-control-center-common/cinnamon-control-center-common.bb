SUMMARY = "Common files for the Cinnamon configuration utilities"
DESCRIPTION = "This package contains common files (icons, pixmaps, locales files) \
needed by the configuration applets in the cinnamon-control-center \
package."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later & MIT"

PV = "6.6.0"

RPM_NAME = "cinnamon-control-center-common-6.6.0-1.3.noarch.rpm"
RPM_HASH = "7ad0a5298f66c368be98cfbb2313eeea255884a62365161cbf672a569c7edb64e8323fd460b26fcdcdb337e409501f697ca192e5dd455ac5d123afee8182c89e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-control-center-common"

RDEPENDS:${PN} += ""

inherit rpm
