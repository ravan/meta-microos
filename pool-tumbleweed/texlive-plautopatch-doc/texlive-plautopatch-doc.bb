SUMMARY = "Documentation for texlive-plautopatch"
DESCRIPTION = "This package includes the documentation for texlive-plautopatch"
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.9qsvn77682"

RPM_NAME = "texlive-plautopatch-doc-2026.226.0.0.9qsvn77682-59.2.noarch.rpm"
RPM_HASH = "6e4b899339d7d5733c7de1def4e004c9d07d21907782c8b38ffa325f38083253f53b4c40f63558e5b1ce5bd456e2e838ea7e4667a71b309668e2fd1a11daa1e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-plautopatch-doc-ja \
texlive-plautopatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
