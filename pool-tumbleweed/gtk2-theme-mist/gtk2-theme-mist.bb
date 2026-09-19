SUMMARY = "Mist Theme for GTK+ 2"
DESCRIPTION = "This package provides the Mist GTK+ 2 theme."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-mist-2.20.2-23.6.noarch.rpm"
RPM_HASH = "0fd3fc9883f590f8b31ba21bbf9a32f456be612745dfebb2df0c723cc7e9fa1b68fc576cfbb06d93fb6b1e69eb4d2f9b37bb6565d497a0562e390a91d536de6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-mist"

RDEPENDS:${PN} += "gtk2-engine-mist"

inherit rpm
