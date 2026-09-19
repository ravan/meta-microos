SUMMARY = "Documentation for texlive-grfext"
DESCRIPTION = "This package includes the documentation for texlive-grfext"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-grfext-doc-2026.226.1.3svn77682-60.4.noarch.rpm"
RPM_HASH = "bcd0432082b1b5fc0df107131b11f4fce97a67dd886886f75753abca0f36d9e694f92c0a4863c90d5eab645e48dc247de1c05e5cae8bd4d14ff8be2f059effad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grfext-doc"

RDEPENDS:${PN} += ""

inherit rpm
