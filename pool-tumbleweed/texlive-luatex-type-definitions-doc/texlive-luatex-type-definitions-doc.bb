SUMMARY = "Documentation for texlive-luatex-type-definitions"
DESCRIPTION = "This package includes the documentation for texlive-luatex-type-definitions"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2.0svn75890"

RPM_NAME = "texlive-luatex-type-definitions-doc-2026.226.0.0.2.0svn75890-59.2.noarch.rpm"
RPM_HASH = "e27438c45f31297cae05ccfa73d70ba2aa64a79e8f56a273fd099ba20cd7c346f7c830d403e229cf8cadf89a20f92ca2bb0974fef706f892e2edcc8bd78bf069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatex-type-definitions-doc"

RDEPENDS:${PN} += ""

inherit rpm
