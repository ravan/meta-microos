SUMMARY = "Documentation for texlive-translations"
DESCRIPTION = "This package includes the documentation for texlive-translations"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12svn77682"

RPM_NAME = "texlive-translations-doc-2026.226.1.12svn77682-59.2.noarch.rpm"
RPM_HASH = "c08d6c7945221af8bcbf4934ecab92464f7c728d5b02b95778e14814e2f4731b76f3cfa93492a8d362f4cadb606eab54702f362061b72ab57881a73d6c9799de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-translations-doc-en \
texlive-translations-doc"

RDEPENDS:${PN} += ""

inherit rpm
