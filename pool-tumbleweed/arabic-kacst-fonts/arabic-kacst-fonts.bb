SUMMARY = "Arabic Kacst Fonts"
DESCRIPTION = "TrueType families developed by Kacst institution."
LICENSE = "GPL-2.0-only"

PV = "2.01"

RPM_NAME = "arabic-kacst-fonts-2.01-18.23.noarch.rpm"
RPM_HASH = "04726e146ad4905843ad08c04641cfbd560661f1fc3c2879f5b316b92c9bbafd628cfe468b17bbe5fdf9c12ab296408607a02dccffc0f179e399ab8409f9bfe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arabic-kacst-fonts \
locale-ar"

RDEPENDS:${PN} += ""

inherit rpm
