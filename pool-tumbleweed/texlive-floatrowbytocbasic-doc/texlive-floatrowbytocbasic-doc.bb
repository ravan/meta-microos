SUMMARY = "Documentation for texlive-floatrowbytocbasic"
DESCRIPTION = "This package includes the documentation for texlive-floatrowbytocbasic"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn67946"

RPM_NAME = "texlive-floatrowbytocbasic-doc-2026.226.1.0svn67946-60.2.noarch.rpm"
RPM_HASH = "d0fc96b5dcfb71f82fa435a0e352a5bd69ce70bbfa100f4893bb70321ecf8020afd0e36bf8c31155992135b0fecbbca786a7d56356703aab296d6757e3523229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-floatrowbytocbasic-doc"

RDEPENDS:${PN} += ""

inherit rpm
