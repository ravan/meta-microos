SUMMARY = "Documentation for texlive-numbersets"
DESCRIPTION = "This package includes the documentation for texlive-numbersets"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn76924"

RPM_NAME = "texlive-numbersets-doc-2026.226.0.0.2.0svn76924-61.2.noarch.rpm"
RPM_HASH = "af8927544f0c1081c217eb808eeed7aeae00cc057f552672ab5d9a24b4fa71e2045c3ebe248addd6e3aeb0b2395cb468445f284f9135b7aaa7963c5306eb0e4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numbersets-doc"

RDEPENDS:${PN} += ""

inherit rpm
