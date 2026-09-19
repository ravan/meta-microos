SUMMARY = "Documentation for texlive-zxjafbfont"
DESCRIPTION = "This package includes the documentation for texlive-zxjafbfont"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-zxjafbfont-doc-2026.226.0.0.2svn77682-59.4.noarch.rpm"
RPM_HASH = "fa38cd8abf7b1302aa5915dac15e3dc0bd563d437e62db8fd626defb74b1b34c541de9577ef8feda4c08084e78e2ad5d0f5809cc59fd14038f546527f9a3c00d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zxjafbfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
