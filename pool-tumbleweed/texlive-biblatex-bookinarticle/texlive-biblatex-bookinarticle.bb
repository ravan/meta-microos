SUMMARY = "Manage book edited in article"
DESCRIPTION = "This package provides three new BibLaTeX entry types - \
@bookinarticle, @bookinincollection and @bookinthesis - to \
refer to a modern edition of an old book, where this modern \
edition is provided in a @article, @incollection or in a \
@thesis. The package is now superseded by biblatex-bookinother."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.1asvn40323"

RPM_NAME = "texlive-biblatex-bookinarticle-2026.226.1.3.1asvn40323-61.2.noarch.rpm"
RPM_HASH = "7fc7540cfda20d17d20724699e567726360bdad91e3a394586ba0962dc910a52754c6f32603bc8c27ec230c26185144ebee654a766c1820156f4968d7511e6ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-bookinarticle.sty \
texlive-biblatex-bookinarticle"

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
