SUMMARY = "Documentation for texlive-fancyqr"
DESCRIPTION = "This package includes the documentation for texlive-fancyqr"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn78199"

RPM_NAME = "texlive-fancyqr-doc-2026.226.2.3svn78199-59.2.noarch.rpm"
RPM_HASH = "d237b1a779df07778d9c712342743e1c59ff696214693d5dc84343f7539136a9eddb72f6fb1c32a5f6558db3a482b7adb551594bda2945df86b96aa97668e4fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyqr-doc"

RDEPENDS:${PN} += ""

inherit rpm
