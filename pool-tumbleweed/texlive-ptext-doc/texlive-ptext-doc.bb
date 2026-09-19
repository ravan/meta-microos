SUMMARY = "Documentation for texlive-ptext"
DESCRIPTION = "This package includes the documentation for texlive-ptext"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-ptext-doc-2026.226.1.1svn77682-60.4.noarch.rpm"
RPM_HASH = "ad9937ec8ec8e2fec7f01d1c61aa9713384cdb5103ec50fbc9bc2853df8ff67345233fa8c9844bdc80e80fbaf43c075aec9a5832b8aecd6afa06cc73a47abb70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ptext-doc-fa \
texlive-ptext-doc"

RDEPENDS:${PN} += ""

inherit rpm
