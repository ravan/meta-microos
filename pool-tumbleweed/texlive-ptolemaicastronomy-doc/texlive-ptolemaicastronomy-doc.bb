SUMMARY = "Documentation for texlive-ptolemaicastronomy"
DESCRIPTION = "This package includes the documentation for texlive-ptolemaicastronomy"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn50810"

RPM_NAME = "texlive-ptolemaicastronomy-doc-2026.226.1.0svn50810-60.4.noarch.rpm"
RPM_HASH = "544ebd16735845abb91f52957e959b7764d844bde7a6f364e177bc783d41ad169fea4642920e011a597c167ef3f151c3418ac129ec6cf8956c38b8235d251e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptolemaicastronomy-doc"

RDEPENDS:${PN} += ""

inherit rpm
