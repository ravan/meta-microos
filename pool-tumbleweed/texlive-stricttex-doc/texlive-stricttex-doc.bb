SUMMARY = "Documentation for texlive-stricttex"
DESCRIPTION = "This package includes the documentation for texlive-stricttex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2betasvn56320"

RPM_NAME = "texlive-stricttex-doc-2026.226.0.0.2betasvn56320-64.2.noarch.rpm"
RPM_HASH = "2f6d1a94cda855ec43602d835ccab02ad5e5ec8245eeb8041a546222b92e87d04c3ce19c77143cf82fd067ca58a10a4f49e9e528bae90bf0db908c263232f521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stricttex-doc"

RDEPENDS:${PN} += ""

inherit rpm
