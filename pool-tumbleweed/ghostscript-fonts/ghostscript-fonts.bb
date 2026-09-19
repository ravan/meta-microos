SUMMARY = "Ghostscript's free fonts"
DESCRIPTION = "Two sets of free fonts are supplied \
by Ghostscript: \
 \
Basic fonts for Ghostscript \
in the package ghostscript-fonts-std. \
 \
Optional Fonts for Ghostscript \
in the package ghostscript-fonts-other."
LICENSE = "GPL-2.0-only"

PV = "9.06"

RPM_NAME = "ghostscript-fonts-9.06-14.4.noarch.rpm"
RPM_HASH = "b9ec87ad3c27f27735dfd0aa67aa632b89d9ffec1bca2b076f6d6f1be13259b7a61699d690609a5a5150f9316fb4dff8b4719e94b26557fb5fdb1807396d547d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostscript-fonts"

RDEPENDS:${PN} += ""

inherit rpm
