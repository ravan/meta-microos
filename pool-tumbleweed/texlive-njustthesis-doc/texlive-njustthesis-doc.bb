SUMMARY = "Documentation for texlive-njustthesis"
DESCRIPTION = "This package includes the documentation for texlive-njustthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.0.1svn62451"

RPM_NAME = "texlive-njustthesis-doc-2026.226.0.0.0.1svn62451-61.2.noarch.rpm"
RPM_HASH = "17446aac2f0de5ba0ca96b021cc234879f213457336c1961df63df4d23359236f05ca6b610c47bedaacaaf74a930fb761def4799e8f0bfa42f537d1462a0d590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-njustthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
