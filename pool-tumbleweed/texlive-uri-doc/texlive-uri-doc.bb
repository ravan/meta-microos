SUMMARY = "Documentation for texlive-uri"
DESCRIPTION = "This package includes the documentation for texlive-uri"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0bsvn77682"

RPM_NAME = "texlive-uri-doc-2026.226.2.0bsvn77682-60.2.noarch.rpm"
RPM_HASH = "577bdb9c77bb4aade5023c027e5c43a64d8ae62ca42fc83ec803232845507d12e6224cad72b251c59f3f53f0e6f669ef216704ed1147fdded299c2aa9a64778f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uri-doc"

RDEPENDS:${PN} += ""

inherit rpm
