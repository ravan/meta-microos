SUMMARY = "Documentation for texlive-codeanatomy"
DESCRIPTION = "This package includes the documentation for texlive-codeanatomy"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5_betasvn76924"

RPM_NAME = "texlive-codeanatomy-doc-2026.226.0.0.5_betasvn76924-60.2.noarch.rpm"
RPM_HASH = "d0d2b40ce043cce130b7cfdc2351c83d5b213ed1837d55f4a8423fc4002a02a268cd3a4e52c30a6eeab2ae76e86dee2fa0416f7eb5af6055abf168a08c409b4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-codeanatomy-doc"

RDEPENDS:${PN} += ""

inherit rpm
