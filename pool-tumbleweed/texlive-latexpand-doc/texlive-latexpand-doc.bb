SUMMARY = "Documentation for texlive-latexpand"
DESCRIPTION = "This package includes the documentation for texlive-latexpand"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.7.2svn66226"

RPM_NAME = "texlive-latexpand-doc-2026.226.1.7.2svn66226-61.2.noarch.rpm"
RPM_HASH = "c80f0a854bb25cd0e511b1482be32f644fa8df2f7d8f7c42294be837cea8c4f7fb5057e5762626a820b982b5719a72d806fdaec449e3c480730b6f5261f48de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexpand-doc"

RDEPENDS:${PN} += ""

inherit rpm
