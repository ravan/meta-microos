SUMMARY = "Documentation for texlive-brandeis-thesis"
DESCRIPTION = "This package includes the documentation for texlive-brandeis-thesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3svn68092"

RPM_NAME = "texlive-brandeis-thesis-doc-2026.226.3.3svn68092-59.2.noarch.rpm"
RPM_HASH = "5db7c349684e00939fb54bd6f2371846bb9c2169d0c821c40648fefc8c4cd67a1949a2a060ac2617b4c500e1483db41539e8a6818d1949f699c5a45061bd4b20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-brandeis-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
