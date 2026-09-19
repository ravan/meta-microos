SUMMARY = "Documentation for texlive-git-latexdiff"
DESCRIPTION = "This package includes the documentation for texlive-git-latexdiff"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.7.1svn75878"

RPM_NAME = "texlive-git-latexdiff-doc-2026.226.1.7.1svn75878-60.2.noarch.rpm"
RPM_HASH = "b13d82ba42e44045465fb097bf900a45bfd51af7c259f6c54755ad0b00711beaccb1634bffdd1152be7b45cf183eb4bb64d6ee3400c3b30d8908824e7e1d91fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-git-latexdiff.1 \
texlive-git-latexdiff-doc"

RDEPENDS:${PN} += ""

inherit rpm
