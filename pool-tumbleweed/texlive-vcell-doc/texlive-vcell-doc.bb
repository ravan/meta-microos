SUMMARY = "Documentation for texlive-vcell"
DESCRIPTION = "This package includes the documentation for texlive-vcell"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn77682"

RPM_NAME = "texlive-vcell-doc-2026.226.1.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "0f0e93908b1c2e0145301b7aef06dbad4af93075eab20c05f16df19da84cc09fe6d69c8a9d068f5c046472493c2301fc75e3b6d4fcfa4b4e971b58c09c8d8b27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vcell-doc"

RDEPENDS:${PN} += ""

inherit rpm
