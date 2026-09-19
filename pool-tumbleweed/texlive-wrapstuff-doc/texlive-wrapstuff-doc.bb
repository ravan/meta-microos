SUMMARY = "Documentation for texlive-wrapstuff"
DESCRIPTION = "This package includes the documentation for texlive-wrapstuff"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-wrapstuff-doc-2026.226.0.0.3svn77682-59.4.noarch.rpm"
RPM_HASH = "c22c62e1fc9fe29ffa21fdc83d377de5ac07f46442e9bfa845965cf95d18cdc198a9123026c583260f0f0157f9eba64b23bef44c4c55533d74275afe39ecc23b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-wrapstuff-doc-zh \
texlive-wrapstuff-doc"

RDEPENDS:${PN} += ""

inherit rpm
