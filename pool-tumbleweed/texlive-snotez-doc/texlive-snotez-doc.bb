SUMMARY = "Documentation for texlive-snotez"
DESCRIPTION = "This package includes the documentation for texlive-snotez"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-snotez-doc-2026.226.0.0.7svn77682-64.2.noarch.rpm"
RPM_HASH = "6f79a3e1b5a393171ef0d1b75de92b2de048037127320d1de65215a31273c4c7bb1a45372c452a5bde9e0332acfec0c5ce8398d3cca94e0e2cf61d061f1c77c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-snotez-doc"

RDEPENDS:${PN} += ""

inherit rpm
