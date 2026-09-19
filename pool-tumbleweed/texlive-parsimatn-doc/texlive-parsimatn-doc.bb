SUMMARY = "Documentation for texlive-parsimatn"
DESCRIPTION = "This package includes the documentation for texlive-parsimatn"
LICENSE = "OFL-1.1"

PV = "2026.226.2.2svn70775"

RPM_NAME = "texlive-parsimatn-doc-2026.226.2.2svn70775-58.2.noarch.rpm"
RPM_HASH = "d63f533a9ce3eddf36d9ff62d8b4165edc17d432b2624d67ad6ab5114ece69e26e00c89a4be02fc1667c52d079e4caabac1b0827124e8e04790560801f1e5ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parsimatn-doc"

RDEPENDS:${PN} += ""

inherit rpm
