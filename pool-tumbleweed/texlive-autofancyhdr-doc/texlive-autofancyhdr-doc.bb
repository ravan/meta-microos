SUMMARY = "Documentation for texlive-autofancyhdr"
DESCRIPTION = "This package includes the documentation for texlive-autofancyhdr"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn54049"

RPM_NAME = "texlive-autofancyhdr-doc-2026.226.0.0.1svn54049-60.2.noarch.rpm"
RPM_HASH = "ef80ac19bc7f247cfac679d156ecca9d20c25d9b208c53bfcd74d15bbd5504535f2233833a632c068d79add1faf011a1054b4d9ceb9efaa2d7bc1972b74aad63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autofancyhdr-doc"

RDEPENDS:${PN} += ""

inherit rpm
