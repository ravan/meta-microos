SUMMARY = "Documentation for texlive-codicefiscaleitaliano"
DESCRIPTION = "This package includes the documentation for texlive-codicefiscaleitaliano"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn29803"

RPM_NAME = "texlive-codicefiscaleitaliano-doc-2026.226.1.2svn29803-60.2.noarch.rpm"
RPM_HASH = "4becb5892f26fa842aa414508436ae6bfd5efcaaeb0dac4563b8ed44c8fb9c53229df022a787d69eda8b6e773fe7f7311640940d756be24c4698ca51e998187b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-codicefiscaleitaliano-doc-it \
texlive-codicefiscaleitaliano-doc"

RDEPENDS:${PN} += ""

inherit rpm
