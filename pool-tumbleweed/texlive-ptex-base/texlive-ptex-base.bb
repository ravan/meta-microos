SUMMARY = "Plain TeX format for pTeX and e-pTeX"
DESCRIPTION = "The bundle contains the plain TeX format for pTeX and e-pTeX."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn64072"

RPM_NAME = "texlive-ptex-base-2026.226.svn64072-60.4.noarch.rpm"
RPM_HASH = "111e5eaa906701d40ad88e18774f38b4384ccfd222c6a842192be220ce5d568feda4ff76e69fd326957e9ed5b820f64901775da16547180f2e12a59f2d1e6342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ascii-jplain.tex \
tex-kinsoku.tex \
tex-ptex.tex \
texlive-ptex-base"

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
