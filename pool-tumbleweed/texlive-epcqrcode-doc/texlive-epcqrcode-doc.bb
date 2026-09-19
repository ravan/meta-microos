SUMMARY = "Documentation for texlive-epcqrcode"
DESCRIPTION = "This package includes the documentation for texlive-epcqrcode"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn76924"

RPM_NAME = "texlive-epcqrcode-doc-2026.226.1.2svn76924-61.4.noarch.rpm"
RPM_HASH = "e87c18b6fa3790a76a674ffdaa2e0283408d192fd7d420633d3de052ec2292b2bcfed5ae0900eada4fd354c0f6881e8890d3087810f5dbd9a9696f2dfe9c2467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epcqrcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
