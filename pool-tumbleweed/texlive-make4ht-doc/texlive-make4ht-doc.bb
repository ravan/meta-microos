SUMMARY = "Documentation for texlive-make4ht"
DESCRIPTION = "This package includes the documentation for texlive-make4ht"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4esvn78133"

RPM_NAME = "texlive-make4ht-doc-2026.226.0.0.4esvn78133-59.2.noarch.rpm"
RPM_HASH = "548563404476388bc8df367a2f1cfdbbbf67d4312cabdc9dd9e33f04ef064a7e5b4798d6d8b60605c8e981dc3caeb80762b7d41ba5af0f24c50896b68f4cca64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-make4ht-doc"

RDEPENDS:${PN} += ""

inherit rpm
