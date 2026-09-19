SUMMARY = "Documentation for texlive-boites"
DESCRIPTION = "This package includes the documentation for texlive-boites"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn32235"

RPM_NAME = "texlive-boites-doc-2026.226.1.1svn32235-59.2.noarch.rpm"
RPM_HASH = "9840b968a23592e198c01c1abe931a9bbf20790265ba723da4bdc0f327c7f4d9893356241e8eb865e044773f7245f8aa50885b44ae538b59745a9be11406187f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boites-doc"

RDEPENDS:${PN} += ""

inherit rpm
