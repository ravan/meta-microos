SUMMARY = "Documentation for texlive-topfloat"
DESCRIPTION = "This package includes the documentation for texlive-topfloat"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn19084"

RPM_NAME = "texlive-topfloat-doc-2026.226.svn19084-59.2.noarch.rpm"
RPM_HASH = "95b24a5d6b1173a99d20345591a975344245641bf38550fd2ab1d54bc5689a8381097eb59d2b208b8382c071f79ca13569bbef6cae2b0eecc32283546d66ca9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-topfloat-doc-it \
texlive-topfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
