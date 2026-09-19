SUMMARY = "Documentation for texlive-vscodeicons"
DESCRIPTION = "This package includes the documentation for texlive-vscodeicons"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn76927"

RPM_NAME = "texlive-vscodeicons-doc-2026.226.0.0.1.0svn76927-60.2.noarch.rpm"
RPM_HASH = "561ea091408bc392d0b575ce2a9de930cae464da412ca939d4a56d4ed897b9a451187153556b120668591b299458b3967e53d61751af2c36715d11cb2c13cd5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vscodeicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
