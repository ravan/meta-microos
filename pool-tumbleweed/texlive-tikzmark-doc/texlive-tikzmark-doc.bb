SUMMARY = "Documentation for texlive-tikzmark"
DESCRIPTION = "This package includes the documentation for texlive-tikzmark"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.15svn64819"

RPM_NAME = "texlive-tikzmark-doc-2026.226.1.15svn64819-59.2.noarch.rpm"
RPM_HASH = "193caf5e656fdc1c4746acd13cb2a709a5171bb9fbcef51a7840fccac456a743159e66084e4a26c273556dfb9cae14c08afa40a66b5f8b0886142e65ec61d988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
