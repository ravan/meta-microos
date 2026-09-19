SUMMARY = "A LaTeX course book"
DESCRIPTION = "The package provides the book and practice files for a LaTeX \
course that the author has give several times at the \
Rijksuniversiteit Groningen (Netherlands)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn39026"

RPM_NAME = "texlive-latexcourse-rug-2026.226.1.1svn39026-61.2.noarch.rpm"
RPM_HASH = "1ad1f3ae468e971f0aacc746dd528089977e4e5d6b96cced1ce67d2ce19ba10299901e669b4197a749999ca3baf3352cd0b77efa339ed0a09b7d690013a5113b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcourse-rug"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
