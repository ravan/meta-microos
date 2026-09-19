SUMMARY = "Documentation for texlive-ukrhyph"
DESCRIPTION = "This package includes the documentation for texlive-ukrhyph"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21081"

RPM_NAME = "texlive-ukrhyph-doc-2026.226.svn21081-60.2.noarch.rpm"
RPM_HASH = "fa7a6bd73d81381e7cf0a5727ea46cb3833443243adac5555d94acbc3a484f0e693f3640db12b6f02334f37ab4d6bb8cc2881045e3726db1cb82205b2184a8db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ukrhyph-doc-en-GB \
texlive-ukrhyph-doc"

RDEPENDS:${PN} += ""

inherit rpm
