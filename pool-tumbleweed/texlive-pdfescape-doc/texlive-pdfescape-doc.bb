SUMMARY = "Documentation for texlive-pdfescape"
DESCRIPTION = "This package includes the documentation for texlive-pdfescape"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.15svn77682"

RPM_NAME = "texlive-pdfescape-doc-2026.226.1.15svn77682-58.2.noarch.rpm"
RPM_HASH = "c7eb3ba80db5a345b155d43141713a8ff47153d81b829f5a45f8bf3439676d88e41228b7253623e5fbadc2d4435e9910d39b8875dd5949d56b5d7d748eabc2c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfescape-doc"

RDEPENDS:${PN} += ""

inherit rpm
