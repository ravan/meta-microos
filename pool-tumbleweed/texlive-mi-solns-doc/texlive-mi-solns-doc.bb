SUMMARY = "Documentation for texlive-mi-solns"
DESCRIPTION = "This package includes the documentation for texlive-mi-solns"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn49651"

RPM_NAME = "texlive-mi-solns-doc-2026.226.0.0.6svn49651-61.2.noarch.rpm"
RPM_HASH = "cb8f5bc07e05c153549f94574507b4ccac86f5e18393ab586c63a07ce7e071873c89f2c91893644e9805735c221f3f20774529e1e0f6f223c2e94dae53125d08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mi-solns-doc"

RDEPENDS:${PN} += ""

inherit rpm
