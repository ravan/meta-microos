SUMMARY = "Documentation for texlive-whatsnote"
DESCRIPTION = "This package includes the documentation for texlive-whatsnote"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0bsvn76836"

RPM_NAME = "texlive-whatsnote-doc-2026.226.5.0bsvn76836-60.2.noarch.rpm"
RPM_HASH = "71386cc6b7adba15ba50b1e3195d1336aa6abab39f050e6c4a4a4bea90b5d54d907b750afd50736219c75a9e975ddccce7e5aaed5fe03ec50b949fd500fd61a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-whatsnote-doc"

RDEPENDS:${PN} += ""

inherit rpm
