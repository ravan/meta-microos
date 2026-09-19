SUMMARY = "Documentation for texlive-noindentafter"
DESCRIPTION = "This package includes the documentation for texlive-noindentafter"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn59195"

RPM_NAME = "texlive-noindentafter-doc-2026.226.1.00svn59195-61.2.noarch.rpm"
RPM_HASH = "c8a46368aa1c3474932482d4bcfdbe3f6e29ca49418725b1cebab60f7163fed29e63a007690f912092537bf46c75f67145bc3db39157c206eb2f6f594df33678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noindentafter-doc"

RDEPENDS:${PN} += ""

inherit rpm
