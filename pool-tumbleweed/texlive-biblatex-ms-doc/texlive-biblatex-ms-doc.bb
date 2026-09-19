SUMMARY = "Documentation for texlive-biblatex-ms"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ms"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0_1svn76924"

RPM_NAME = "texlive-biblatex-ms-doc-2026.226.4.0_1svn76924-61.2.noarch.rpm"
RPM_HASH = "12e9c6c63b9491caa810b19d9108df59acae710adc3f534cbc0e833983a1b63f4c25311a5d21d9afdf4770a5f184ff23cf5635668b757b76ba4e352e6e7c0384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-ms-doc-en \
texlive-biblatex-ms-doc"

RDEPENDS:${PN} += ""

inherit rpm
