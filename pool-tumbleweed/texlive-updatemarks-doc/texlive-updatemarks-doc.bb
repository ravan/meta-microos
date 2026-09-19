SUMMARY = "Documentation for texlive-updatemarks"
DESCRIPTION = "This package includes the documentation for texlive-updatemarks"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4asvn76924"

RPM_NAME = "texlive-updatemarks-doc-2026.226.0.0.4asvn76924-60.2.noarch.rpm"
RPM_HASH = "7d3ba9e6d1a5621c2f072fcbc23780f96668e6c34fe30047d6fa410059419dad97c7e806deed92189ab686e91c84e2999a07d09e894f7e90e83eb2fe1746e991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-updatemarks-doc"

RDEPENDS:${PN} += ""

inherit rpm
