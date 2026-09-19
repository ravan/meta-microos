SUMMARY = "Documentation for texlive-tools"
DESCRIPTION = "This package includes the documentation for texlive-tools"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76708"

RPM_NAME = "texlive-tools-doc-2026.226.svn76708-59.2.noarch.rpm"
RPM_HASH = "04301a380553a406022b6b0bfa308046afa4ca821b39fd4e46887d1ca82a2e206f3aa0e0fca8d17b33bc11312cae4deeac08577fc9234638811baba378a31e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
