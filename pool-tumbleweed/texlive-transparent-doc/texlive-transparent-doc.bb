SUMMARY = "Documentation for texlive-transparent"
DESCRIPTION = "This package includes the documentation for texlive-transparent"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-transparent-doc-2026.226.1.6svn77682-59.2.noarch.rpm"
RPM_HASH = "d93f2335de6ea50036ac0020846b1898a0801ecd4346ca423225790f5d18304653387c5b29ef48955eec422f356a1d29ee4cdea61cc65ca445b253539053bbbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-transparent-doc"

RDEPENDS:${PN} += ""

inherit rpm
