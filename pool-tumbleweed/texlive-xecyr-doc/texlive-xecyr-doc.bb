SUMMARY = "Documentation for texlive-xecyr"
DESCRIPTION = "This package includes the documentation for texlive-xecyr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-xecyr-doc-2026.226.1.2svn77682-59.4.noarch.rpm"
RPM_HASH = "fa4eeb3b48341d8fa55d244ae22d0f6bfc4e6cd2ec6c008842935eb3738549362c468929c158fe29f8adfe01d74bbdd975f86c576f3961f59a08c379839fc8ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xecyr-doc-ru \
texlive-xecyr-doc"

RDEPENDS:${PN} += ""

inherit rpm
