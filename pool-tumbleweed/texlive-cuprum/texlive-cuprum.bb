SUMMARY = "Cuprum font family support for LaTeX"
DESCRIPTION = "This package provides support for the Cuprum font family (see \
http://jovanny.ru)."
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-cuprum-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "dc24ffa36cfc0c8cb71e686bc81cf14a9e90f98094af75877b3841c2620107695bb490e55b5cde69be0a1e47cefc9fc2006724c77095a167d875027d1baca2d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cprbit8t.tfm \
tex-cprbn8t.tfm \
tex-cprmit8t.tfm \
tex-cprmn8t.tfm \
tex-cuprum.map \
tex-cuprum.sty \
tex-t1cpr.fd \
texlive-cuprum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-cuprum-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
