SUMMARY = "Documentation for texlive-lexikon"
DESCRIPTION = "This package includes the documentation for texlive-lexikon"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0csvn17364"

RPM_NAME = "texlive-lexikon-doc-2026.226.1.0csvn17364-61.2.noarch.rpm"
RPM_HASH = "399abe501341800bafcbf63bae809d4d879fa7e99772a44986919a0d5f6155efb801460eda739060327463d997e1e03c3ce4b925cda23217e15c468d86fc2d51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lexikon-doc"

RDEPENDS:${PN} += ""

inherit rpm
