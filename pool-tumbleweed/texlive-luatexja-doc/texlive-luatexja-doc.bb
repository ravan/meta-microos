SUMMARY = "Documentation for texlive-luatexja"
DESCRIPTION = "This package includes the documentation for texlive-luatexja"
LICENSE = "BSD-3-Clause"

PV = "2026.226.20260130.1svn78101"

RPM_NAME = "texlive-luatexja-doc-2026.226.20260130.1svn78101-59.2.noarch.rpm"
RPM_HASH = "1accf4e8a688ffefb2c73dd0ba127b733b4a4749d53bbb2c2738530ead6de6e3b15f89e9f03b87b2f0ea796e47ed5537fb047cb6249b2c681953b1085a8674c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-luatexja-doc-en;ja \
texlive-luatexja-doc"

RDEPENDS:${PN} += ""

inherit rpm
