SUMMARY = "Documentation for texlive-xetexko"
DESCRIPTION = "This package includes the documentation for texlive-xetexko"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.6svn77682"

RPM_NAME = "texlive-xetexko-doc-2026.226.4.6svn77682-59.4.noarch.rpm"
RPM_HASH = "12e83aecbb448fba690ebf8335bddf803bb3d2bee37618b8e550a95da37c5d56fba66c1483dc32e6c6fbfaf37493f75f5cad1d5de49421c646cdee9b6ef3c768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xetexko-doc-ko \
texlive-xetexko-doc"

RDEPENDS:${PN} += ""

inherit rpm
