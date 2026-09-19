SUMMARY = "Translations for package gtk-doc-manual"
DESCRIPTION = "Provides translations for the 'gtk-doc-manual' package."
LICENSE = "GFDL-1.1-or-later"

PV = "1.36.1"

RPM_NAME = "gtk-doc-manual-lang-1.36.1-1.2.noarch.rpm"
RPM_HASH = "9e5973eb6a5b38204e90e2d42229d707e47dc7cfff907bbd2cfa9d11628d5818cfb08875cb6eaa7784118308cb10ff920856b23a738e3251394c44308c6fa015"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk-doc-manual-lang \
gtk-doc-manual-lang-all"

RDEPENDS:${PN} += "gtk-doc-manual"

inherit rpm
