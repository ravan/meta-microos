SUMMARY = "Documentation for texlive-cd"
DESCRIPTION = "This package includes the documentation for texlive-cd"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.4svn34452"

RPM_NAME = "texlive-cd-doc-2026.226.1.4svn34452-59.2.noarch.rpm"
RPM_HASH = "cedef8c846500be3313f3060109416b703b91b6addb4d7c73790f9210f9a92bd99b75c202dbde086295ebe009acc199b031fb0436a22b022938230ae6ad18ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cd-doc"

RDEPENDS:${PN} += "/usr/bin/ruby"

inherit rpm
