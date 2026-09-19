SUMMARY = "Generate slideshow with MetaPost"
DESCRIPTION = "The package provides a means of creating presentations in \
MetaPost, without intervention from other utilities (except a \
distiller). Such an arrangement has its advantages (though \
there are disadvantages too)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-slideshow-2026.226.1.0svn15878-64.2.noarch.rpm"
RPM_HASH = "2b93e7391024675dd94c27c31ddd872f382518804ab73392a8f723c6fd35bdd33b7493bba4975069d670ddc2fc7520a634e436493ec453ea42e7c794d9d73d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-slideshow"

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
