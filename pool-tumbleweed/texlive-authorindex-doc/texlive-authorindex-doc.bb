SUMMARY = "Documentation for texlive-authorindex"
DESCRIPTION = "This package includes the documentation for texlive-authorindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn51757"

RPM_NAME = "texlive-authorindex-doc-2026.226.svn51757-60.2.noarch.rpm"
RPM_HASH = "a4775e3d9553f973256dd6ffe7d64a0cdae2212dd79bd095db1716805e2ecd022e2c973830015c1a79ef2f2877c8631f4b689174c0635345ac2a238766bd2f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-authorindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
