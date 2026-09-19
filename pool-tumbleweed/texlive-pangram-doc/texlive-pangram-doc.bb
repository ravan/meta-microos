SUMMARY = "Documentation for texlive-pangram"
DESCRIPTION = "This package includes the documentation for texlive-pangram"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0csvn76924"

RPM_NAME = "texlive-pangram-doc-2026.226.0.0.0csvn76924-58.2.noarch.rpm"
RPM_HASH = "357fae116b35201e8a4c143dd784a0be8c249ec58bdfbf5a335bf6291d72c87d81f5d53fedea20f2067bcbdee3cc4da0446d234898241c6fb4d1ab2d95936e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pangram-doc"

RDEPENDS:${PN} += ""

inherit rpm
