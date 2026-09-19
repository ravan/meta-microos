SUMMARY = "Documentation for texlive-fancyslides"
DESCRIPTION = "This package includes the documentation for texlive-fancyslides"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn36263"

RPM_NAME = "texlive-fancyslides-doc-2026.226.1.0svn36263-59.2.noarch.rpm"
RPM_HASH = "319eed673b4f63d709cd625dc5f0c4fab862b9ff1f4bd8672515924b54958cda671ce0d620e4826bf19b5c7e02a6775956dff0982735d4a322e932b7106a009d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyslides-doc"

RDEPENDS:${PN} += ""

inherit rpm
