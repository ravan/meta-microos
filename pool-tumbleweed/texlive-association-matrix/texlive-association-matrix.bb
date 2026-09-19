SUMMARY = "LaTeX support for creating association matrices"
DESCRIPTION = "This package allows the creation of association matrices in an \
clear and concise fashion, without having to deal with manually \
generating and modifying the tables while working. All you have \
to do is define the rows and the columns by their unique \
identifier, and then specify which cells should be marked as \
associated. Then, the \\amxgenerate command generates a table \
that shows in the cells with a blip (*) where the association \
was added. The package depends on etoolbox, forloop, ifthen, \
textcomp, and xparse."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-association-matrix-2026.226.1.1svn76924-60.2.noarch.rpm"
RPM_HASH = "674fe6c9a43c9ee1a2613cdeecbdffacf73ee198d096040e202372811c517edaa12c368927e2b7041f5301b8ccd499f1d52199d93b99e2621552419785349f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-association-matrix.sty \
texlive-association-matrix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-forloop.sty \
tex-ifthen.sty \
tex-textcomp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
