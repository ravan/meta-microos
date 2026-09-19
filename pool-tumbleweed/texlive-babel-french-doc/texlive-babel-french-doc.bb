SUMMARY = "Documentation for texlive-babel-french"
DESCRIPTION = "This package includes the documentation for texlive-babel-french"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0esvn77682"

RPM_NAME = "texlive-babel-french-doc-2026.226.4.0esvn77682-60.2.noarch.rpm"
RPM_HASH = "a07a71fb8cc18165a12933b49538515491c1ac7397ab4f819cabfb6227674e9da377ad9d7b949cfab84bd15fd723985ff7f13bdbabec0a985298282830c94d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-babel-french-doc-fr \
texlive-babel-french-doc"

RDEPENDS:${PN} += ""

inherit rpm
