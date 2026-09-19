SUMMARY = "Documentation for texlive-pst-uml"
DESCRIPTION = "This package includes the documentation for texlive-pst-uml"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.83svn15878"

RPM_NAME = "texlive-pst-uml-doc-2026.226.0.0.83svn15878-60.4.noarch.rpm"
RPM_HASH = "2849810a11f04f8435c904b68ee0988eaa8ca0dd76af2db337d4be178f2987a29747b522c015fa69aa080edcdf487a4e9d7157512a23bf061bcfad18d9716428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-uml-doc-fr \
texlive-pst-uml-doc"

RDEPENDS:${PN} += ""

inherit rpm
