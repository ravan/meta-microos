SUMMARY = "Documentation for texlive-uwa-letterhead"
DESCRIPTION = "This package includes the documentation for texlive-uwa-letterhead"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn78219"

RPM_NAME = "texlive-uwa-letterhead-doc-2026.226.1.0.1svn78219-60.2.noarch.rpm"
RPM_HASH = "e1b9d13b2010f70bbf986038af09fa7e65168c5830cb314a68aeb98548c72ee7a1bb8c2e9afaa37da171170d66275695df925d4b26d203e4618de2a0568dee1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwa-letterhead-doc"

RDEPENDS:${PN} += ""

inherit rpm
