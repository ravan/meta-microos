SUMMARY = "Documentation for texlive-tufte-latex"
DESCRIPTION = "This package includes the documentation for texlive-tufte-latex"
LICENSE = "Apache-1.0"

PV = "2026.226.3.5.2svn77682"

RPM_NAME = "texlive-tufte-latex-doc-2026.226.3.5.2svn77682-59.2.noarch.rpm"
RPM_HASH = "29912a7c58d55694587d0fec8c4c7db17f4ab2a5d08b86da9e175e9a66001e6cd7ec664f89285bf3939ab4076f4318099fc3eb7bb4de7f5e3ce3ef54ebc3cef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tufte-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
