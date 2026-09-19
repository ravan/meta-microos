SUMMARY = "Documentation for texlive-oplotsymbl"
DESCRIPTION = "This package includes the documentation for texlive-oplotsymbl"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn44951"

RPM_NAME = "texlive-oplotsymbl-doc-2026.226.1.4svn44951-61.2.noarch.rpm"
RPM_HASH = "730d81aa196896a07ce60d07f2804d64ace59630a97f34144f269999aa9aa17d2f558fb0b4025a44f81c8eebb3452a6b77e99ba8365eb1f0cbfe441d676dc473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oplotsymbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
