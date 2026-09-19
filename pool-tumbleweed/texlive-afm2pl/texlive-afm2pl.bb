SUMMARY = "Convert AFM to TeX property list (.pl) metrics"
DESCRIPTION = "Program home page: https://tex.aanhet.net/afm2pl/"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71515"

RPM_NAME = "texlive-afm2pl-2026.226.svn71515-61.2.noarch.rpm"
RPM_HASH = "f9ea8340cb5846865f4118f208493f73f3223de4d99025d3270b2d879af3ff06be2df540476719f1eb76925378733bbe9c0b89af1c719aba2cfcd6db07e814d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-afm2pl-ot1.enc \
tex-afm2pl-ot1ital.enc \
tex-afm2pl-ot1tt.enc \
tex-afm2pl-texnanlc.enc \
tex-afm2pl-texnanuc.enc \
tex-makesc8y.tex \
texlive-afm2pl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-afm2pl-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
