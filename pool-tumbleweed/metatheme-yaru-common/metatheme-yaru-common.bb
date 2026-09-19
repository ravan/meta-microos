SUMMARY = "Common files for the Yaru Gtk Theme"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub."
LICENSE = "CC-BY-SA-4.0 & GPL-3.0-or-later & LGPL-2.1-only & LGPL-3.0-only"

PV = "24.04.0"

RPM_NAME = "metatheme-yaru-common-24.04.0-1.9.noarch.rpm"
RPM_HASH = "f7ea9695287f70fa2800bbc644d0c5969ee18bbdffe1d00b1cc636952e500be05c671aaadadf2dba83ccf5c672fbd3bb01552b0ebed4077e1ffffa46e07d1ed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-yaru-common"

RDEPENDS:${PN} += ""

inherit rpm
