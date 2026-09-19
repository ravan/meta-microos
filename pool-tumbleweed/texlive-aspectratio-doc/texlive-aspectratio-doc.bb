SUMMARY = "Documentation for texlive-aspectratio"
DESCRIPTION = "This package includes the documentation for texlive-aspectratio"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn25243"

RPM_NAME = "texlive-aspectratio-doc-2026.226.2.0svn25243-60.2.noarch.rpm"
RPM_HASH = "d360fd84409d8cca095a301792b419eba582f83161fdc706f188f08ad444aa4253e38778bbbeb6ec6bffa0dbec10a9c75868baf55cf0155e1ca8bcae1fce7ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aspectratio-doc"

RDEPENDS:${PN} += ""

inherit rpm
