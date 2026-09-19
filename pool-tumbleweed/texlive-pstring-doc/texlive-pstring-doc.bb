SUMMARY = "Documentation for texlive-pstring"
DESCRIPTION = "This package includes the documentation for texlive-pstring"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn42857"

RPM_NAME = "texlive-pstring-doc-2026.226.svn42857-60.4.noarch.rpm"
RPM_HASH = "844a02eb2f1fdf7d56fd715347c99b6e6d8195377409282ef2ef22ae0205a316341ff73c187dba63d2eaa5d7f5d36e289cce38ca1b119be2171fc07a49f7f2a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstring-doc"

RDEPENDS:${PN} += ""

inherit rpm
