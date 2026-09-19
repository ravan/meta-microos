SUMMARY = "Documentation for texlive-datetime2-basque"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-basque"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn47064"

RPM_NAME = "texlive-datetime2-basque-doc-2026.226.1.2asvn47064-59.2.noarch.rpm"
RPM_HASH = "79ad5ace070631f0fc8b55ca25bb81c956547f8c162980ba8b661c0155e9b50fd4e0207e09969c5972542f4c06b62058bb6bd150ab127fe341d0e3c46e48bd04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-basque-doc"

RDEPENDS:${PN} += ""

inherit rpm
