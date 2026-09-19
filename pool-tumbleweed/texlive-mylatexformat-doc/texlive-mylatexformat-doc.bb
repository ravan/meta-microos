SUMMARY = "Documentation for texlive-mylatexformat"
DESCRIPTION = "This package includes the documentation for texlive-mylatexformat"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.4svn21392"

RPM_NAME = "texlive-mylatexformat-doc-2026.226.3.4svn21392-61.2.noarch.rpm"
RPM_HASH = "6aadb3eb43777b0458778c43e34d31733dd5b6fe117e33033c98c4db99a5b03284c384abdae838e29f7d19aee60a4bc43887dc7c5df40ff504df90c36f87240a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mylatexformat-doc"

RDEPENDS:${PN} += ""

inherit rpm
