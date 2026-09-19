SUMMARY = "Creating and managing exercises, and reusing them as composed sets"
DESCRIPTION = "This package makes it easier to maintain and edit your exercise \
sets. Exercises are saved as separate files containing part \
problems. These files can be used to make sets, and you can \
cherry-pick or exclude certain part problems as you see fit."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.0svn50448"

RPM_NAME = "texlive-exercisebank-2026.226.0.0.3.0svn50448-59.2.noarch.rpm"
RPM_HASH = "5c5363e440affd047e26be39ed381bffdaad7c3840153746f1592682c3760289bd43f64fa88a8f75ab376a621b720dbb9d51072e128030ada0c648fd076850db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exercisebank.sty \
texlive-exercisebank"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-comment.sty \
tex-geometry.sty \
tex-listofitems.sty \
tex-needspace.sty \
tex-pgffor.sty \
tex-pgfpages.sty \
tex-scrextend.sty \
tex-trimspaces.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
