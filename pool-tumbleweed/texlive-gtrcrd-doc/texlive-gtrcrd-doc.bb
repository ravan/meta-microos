SUMMARY = "Documentation for texlive-gtrcrd"
DESCRIPTION = "This package includes the documentation for texlive-gtrcrd"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn32484"

RPM_NAME = "texlive-gtrcrd-doc-2026.226.1.1svn32484-60.4.noarch.rpm"
RPM_HASH = "7b2e4c33d258361f09352eb16ccc910f946e01ff2b18dcce5fee03c6ddaa6ed3b523b97098b4f9414d0996de910cded2c8d1d39167fc0cdf728cdc389f89a44e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtrcrd-doc"

RDEPENDS:${PN} += ""

inherit rpm
