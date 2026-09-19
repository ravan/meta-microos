SUMMARY = "Documentation for texlive-autobreak"
DESCRIPTION = "This package includes the documentation for texlive-autobreak"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-autobreak-doc-2026.226.0.0.3svn77682-60.2.noarch.rpm"
RPM_HASH = "4e45e7a9805e93b5102484e99d25f50b881bedb6c9047af1de7fb1ce8fba94681a77c7b6c8dd3002e3863cb8de4d2df340fc801a664a2ad368ec41039216a0f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-autobreak-doc-en \
texlive-autobreak-doc"

RDEPENDS:${PN} += ""

inherit rpm
