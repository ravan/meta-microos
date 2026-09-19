SUMMARY = "Universal titlepages with configuration options and predefined styles"
DESCRIPTION = "Creation of title pages is something most authors should not \
have to do. But reality is not perfect, so a lot of authors \
have to do it. This package not only provides several pages for \
the title instead of only one -- at least five are typical for \
a thesis! --, it also provides a bunch of predefined titlepage \
styles with several standard elements, and optionally \
additional elements."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76033"

RPM_NAME = "texlive-uni-titlepage-2026.226.1.4svn76033-60.2.noarch.rpm"
RPM_HASH = "60c6128a3a9a02bb0bf0f7b779e8bf023f3adedd34b7e44c0d23e7c1fd8a87a64774bbf6ba3d8b6c5577d35c401259243e837a5cd75943c095a21066092731ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-title-DHBW.def \
tex-title-JT-Aufsaetze.def \
tex-title-JT-Geschichte.def \
tex-title-JT-Typography.def \
tex-title-KIT.def \
tex-title-KOMAScript.def \
tex-title-Markus-1.def \
tex-title-Markus-2.def \
tex-title-Spacer.def \
tex-title-TU-DD.def \
tex-title-TU-HH.def \
tex-title-UKoLa.def \
tex-title-WWUM.def \
tex-uni-titlepage.sty \
texlive-uni-titlepage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-scrbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
