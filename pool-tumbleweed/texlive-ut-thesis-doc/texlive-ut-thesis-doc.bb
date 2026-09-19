SUMMARY = "Documentation for texlive-ut-thesis"
DESCRIPTION = "This package includes the documentation for texlive-ut-thesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1.8svn78219"

RPM_NAME = "texlive-ut-thesis-doc-2026.226.3.1.8svn78219-60.2.noarch.rpm"
RPM_HASH = "b919a14b084345197e4d17f8df96705076492d6a49b4fa20a32452d0dc20fc226adc7410f69f49abca221e8dee944368be12c3d9f28d264498ec7a73d8d31180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ut-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
