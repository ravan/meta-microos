SUMMARY = "Title page for dissertations at the University of Wollongong"
DESCRIPTION = "The package redefines \\maketitle to generate a title page for a \
University of Wollongong thesis, in accordance with the UoW \
branding guidelines. The package should be used with the book \
class to typeset a thesis. The package also defines a \
\\declaration command that typesets the declaration that this \
thesis is your own work, etc., which is required in the front \
of each PhD Thesis."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.1svn54512"

RPM_NAME = "texlive-uowthesistitlepage-2026.226.3.0.1svn54512-60.2.noarch.rpm"
RPM_HASH = "e5204e03a7b5adc9f7f1d81c6f24facf464af65482a8936c27bf5a979915a479f5ac92c350f9f1e1a09975860bd0630a73463e83902b520abefa040ee4c3e8d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uowthesistitlepage.sty \
texlive-uowthesistitlepage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ragged2e.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
