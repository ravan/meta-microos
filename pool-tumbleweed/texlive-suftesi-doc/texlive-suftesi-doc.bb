SUMMARY = "Documentation for texlive-suftesi"
DESCRIPTION = "This package includes the documentation for texlive-suftesi"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2.6svn73055"

RPM_NAME = "texlive-suftesi-doc-2026.226.3.2.6svn73055-64.2.noarch.rpm"
RPM_HASH = "5d963822766bec345fe9ffb77276919dd93a651af3f1364c45e4273f6a355c5f296ef9c47c632ec1c2a2a5c557d71d7f773ef1048cc45dd735f57365f727fe8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-suftesi-doc-en \
texlive-suftesi-doc"

RDEPENDS:${PN} += ""

inherit rpm
