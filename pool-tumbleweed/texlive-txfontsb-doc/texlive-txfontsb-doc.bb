SUMMARY = "Documentation for texlive-txfontsb"
DESCRIPTION = "This package includes the documentation for texlive-txfontsb"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1.1svn54512"

RPM_NAME = "texlive-txfontsb-doc-2026.226.1.1.1svn54512-59.2.noarch.rpm"
RPM_HASH = "ca4b75a7911e91e5684088bca753d10f6760a55fccff943261f7f4be3a887cde07ee9f756f7af4bc2bf90170af7a740450dbc27d67e58b6d80d314d6f1d54ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-txfontsb-doc"

RDEPENDS:${PN} += ""

inherit rpm
