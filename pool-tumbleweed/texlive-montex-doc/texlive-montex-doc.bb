SUMMARY = "Documentation for texlive-montex"
DESCRIPTION = "This package includes the documentation for texlive-montex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.ivu.04.092svn29349"

RPM_NAME = "texlive-montex-doc-2026.226.ivu.04.092svn29349-61.2.noarch.rpm"
RPM_HASH = "0d640f656f08885ba06c06991031b64d03cc1eaf511aee4954c234cbf4aaa437524b9e05da6e99a5032ddf4c9b2355d33572d5517005604cf60b5a696c2ff921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-montex-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
