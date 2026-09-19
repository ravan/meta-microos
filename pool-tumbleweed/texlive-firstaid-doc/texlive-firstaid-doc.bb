SUMMARY = "Documentation for texlive-firstaid"
DESCRIPTION = "This package includes the documentation for texlive-firstaid"
LICENSE = "LPPL-1.0"

PV = "2026.226.20251101asvn76740"

RPM_NAME = "texlive-firstaid-doc-2026.226.20251101asvn76740-59.2.noarch.rpm"
RPM_HASH = "1e513664a4757bdcce2b658216697433f917ce6ccf99b049a82331f8167f99de418aea4291dfe316934fa2fa33c1725fc0c5f4c169b41d1451baf7d203ad54d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-firstaid-doc"

RDEPENDS:${PN} += ""

inherit rpm
