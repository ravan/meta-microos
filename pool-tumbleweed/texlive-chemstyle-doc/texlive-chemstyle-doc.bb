SUMMARY = "Documentation for texlive-chemstyle"
DESCRIPTION = "This package includes the documentation for texlive-chemstyle"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0msvn31096"

RPM_NAME = "texlive-chemstyle-doc-2026.226.2.0msvn31096-60.2.noarch.rpm"
RPM_HASH = "cc91d1766493eb84b9a128142dac4b108909b98adb60580aab47c1c2830ded6291fc3682fabe18ca1da363e90b49eb7e86b9a961d88e296486a550488baf24c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemstyle-doc"

RDEPENDS:${PN} += ""

inherit rpm
