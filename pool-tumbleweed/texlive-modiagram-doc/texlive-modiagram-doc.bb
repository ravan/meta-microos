SUMMARY = "Documentation for texlive-modiagram"
DESCRIPTION = "This package includes the documentation for texlive-modiagram"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn76924"

RPM_NAME = "texlive-modiagram-doc-2026.226.0.0.3asvn76924-61.2.noarch.rpm"
RPM_HASH = "35bbc885f714c594180864e50179f4cae279e88dfef617025f9e0578542e7d1324ef0add4119b351e208100628a78a9a4b1316f431f46c5427c250358091db4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-modiagram-doc-en \
texlive-modiagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
