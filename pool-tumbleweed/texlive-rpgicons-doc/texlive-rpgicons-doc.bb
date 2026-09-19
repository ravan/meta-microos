SUMMARY = "Documentation for texlive-rpgicons"
DESCRIPTION = "This package includes the documentation for texlive-rpgicons"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6.0svn78136"

RPM_NAME = "texlive-rpgicons-doc-2026.226.2.6.0svn78136-60.2.noarch.rpm"
RPM_HASH = "3f51ea3776cb705062accb81e430ec19a5243bb965f10c2295fb0c1bca1c71ced7a15cc35e5b7f4c3bbae5ce099ef8c436e63d15202856378a2fe0fc9af70793"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rpgicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
