SUMMARY = "Documentation for texlive-zugferd"
DESCRIPTION = "This package includes the documentation for texlive-zugferd"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10svn76924"

RPM_NAME = "texlive-zugferd-doc-2026.226.0.0.10svn76924-59.4.noarch.rpm"
RPM_HASH = "6f741e5ff4641d4c7c980406fb9312a182464660333843ac63607ba4192372e7bd156c634c84a2f16ca9199dd784e8b1b156e95ee173f99b7334b53ab977ca6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zugferd-doc"

RDEPENDS:${PN} += ""

inherit rpm
