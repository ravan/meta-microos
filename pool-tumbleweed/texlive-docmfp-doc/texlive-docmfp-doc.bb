SUMMARY = "Documentation for texlive-docmfp"
DESCRIPTION = "This package includes the documentation for texlive-docmfp"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2dsvn15878"

RPM_NAME = "texlive-docmfp-doc-2026.226.1.2dsvn15878-59.2.noarch.rpm"
RPM_HASH = "92089b573843f301f53a4f847f85f40768b1de2fc2dfca1ba8942e9a570abac588b15c460897b4d3b777c5dfefa63d4f16fe798981f79875161f8e5132e0aab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-docmfp-doc"

RDEPENDS:${PN} += ""

inherit rpm
