SUMMARY = "Babel support for Interlingua"
DESCRIPTION = "The package provides the language definition file for support \
of Interlingua in babel. Translations to Interlingua of \
standard 'LaTeX names' (no shortcuts are provided). Interlingua \
itself is an auxiliary language, built from the common \
vocabulary of Spanish/Portuguese, English, Italian and French, \
with some normalisation of spelling."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-babel-interlingua-2026.226.1.6svn77682-60.2.noarch.rpm"
RPM_HASH = "a4db51d339ec923af4f5233f9c135c68384ebb953590134d0f4fcb2989e56a361e362e6308ae7e51a7978a1669a8c40c0aba48afe6adbd259771aebd8f9ff807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interlingua.ldf \
texlive-babel-interlingua"

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
