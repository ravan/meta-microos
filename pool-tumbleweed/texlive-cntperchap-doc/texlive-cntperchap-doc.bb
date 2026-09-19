SUMMARY = "Documentation for texlive-cntperchap"
DESCRIPTION = "This package includes the documentation for texlive-cntperchap"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn37572"

RPM_NAME = "texlive-cntperchap-doc-2026.226.0.0.3svn37572-60.2.noarch.rpm"
RPM_HASH = "1ebe3803bbf31ec084e14bfb5ef56c4e8f8b8a1fd45bb8dc4765059d65524648e925f844c526911b6d80eadc9680d5c70b4523cfbf73b2ff1a86c28c15bc2146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cntperchap-doc"

RDEPENDS:${PN} += ""

inherit rpm
