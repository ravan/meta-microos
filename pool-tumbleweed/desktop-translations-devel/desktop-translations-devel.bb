SUMMARY = "Desktop Files Translations po Files"
DESCRIPTION = "This package provides the translations for installed desktop files as po files."
LICENSE = "MIT"

PV = "84.87.20241104.9505069"

RPM_NAME = "desktop-translations-devel-84.87.20241104.9505069-1.6.noarch.rpm"
RPM_HASH = "5a109e89768276076e33232ee75b7e9a92c75130a2d375b3a5b1259460ef2728a32342149fa0e81c5b28f1bea85c11d391751854e24480c9d75abcf172222253"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "desktop-translations-devel"

RDEPENDS:${PN} += ""

inherit rpm
