SUMMARY = "Documentation for texlive-hustthesis"
DESCRIPTION = "This package includes the documentation for texlive-hustthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn76924"

RPM_NAME = "texlive-hustthesis-doc-2026.226.2.0.0svn76924-60.2.noarch.rpm"
RPM_HASH = "8ef44576675506de87a745e5a4af33d4e6fcf0165f0131f48806bd14f139dbe6d24b6e4ceb262a32e025694dc66ddd0f1133210069469fcca56fd529a6b5c15f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hustthesis-doc-zh \
texlive-hustthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
