SUMMARY = "Documentation for texlive-gauss"
DESCRIPTION = "This package includes the documentation for texlive-gauss"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn32934"

RPM_NAME = "texlive-gauss-doc-2026.226.svn32934-60.2.noarch.rpm"
RPM_HASH = "c3a556f4d482aa4ac49d60caaab87ee3856e40d758bfae3980c99b0c87ef0b5b499bd965d73b01d6513f9476bf204eba59d94cef321bedc8f04e68dcd077a2d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gauss-doc"

RDEPENDS:${PN} += ""

inherit rpm
