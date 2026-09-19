SUMMARY = "Documentation for texlive-japanese-mathformulas"
DESCRIPTION = "This package includes the documentation for texlive-japanese-mathformulas"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn64678"

RPM_NAME = "texlive-japanese-mathformulas-doc-2026.226.1.0.2svn64678-63.2.noarch.rpm"
RPM_HASH = "09d2e1e65d727ae095d69228c2351290118a8fec7807a332ab2457cecd63fb22ff15a93cf189c5248935de60872df6fcdb2779d7c20830f6f05f1ea7d9fc4e95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-japanese-mathformulas-doc-ja \
texlive-japanese-mathformulas-doc"

RDEPENDS:${PN} += ""

inherit rpm
