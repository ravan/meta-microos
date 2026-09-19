SUMMARY = "Documentation for texlive-ticket"
DESCRIPTION = "This package includes the documentation for texlive-ticket"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.4dsvn42280"

RPM_NAME = "texlive-ticket-doc-2026.227.0.0.4dsvn42280-62.2.noarch.rpm"
RPM_HASH = "9d140138cf95fe8b794ca0c109c25c805459555be6bf672fb2a832e7636e7ed86d6ce2948031e27ffa682fe63fb7336e8bf50d221518a42887a38f2af6788bab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ticket-doc"

RDEPENDS:${PN} += ""

inherit rpm
