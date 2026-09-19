SUMMARY = "Japanese font setup for pLaTeX and upLaTeX"
DESCRIPTION = "This package enables users to declare in their document which \
physical fonts should be used for the standard Japanese \
(logical) fonts of pLaTeX and upLaTeX. Font setup is realized \
by changing the font mapping of dvipdfmx, and thus users can \
use any (monospaced) physical fonts they like, once they \
properly install this package, without creating helper files \
for each new font. This package also supports setup for the \
fonts used in the japanese-otf package. System requirements: \
TeX format: LaTeX. TeX engine: pTeX or upTeX. DVIware: \
dvipdfmx. Prerequisite packages: atbegshi."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-pxchfon-2026.226.2.2svn77682-60.4.noarch.rpm"
RPM_HASH = "752efccd7d386ac14a578f3f7d64dbc4dd1d976844f8454d78d2eddd28b4146affe74da02a8d00a8c071b59128cc40fad025f8ac890ef502356a449371b7a4d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cfjam-r-l0j.tfm \
tex-cfjam-r-l0j.vf \
tex-cfjam-r-l5j.tfm \
tex-cfjam-r-l5j.vf \
tex-cfjam-r-t1.tfm \
tex-cfjam-r-t1.vf \
tex-cfjam-r-ts1.tfm \
tex-cfjam-r-ts1.vf \
tex-cfjar-b-l0j.tfm \
tex-cfjar-b-l0j.vf \
tex-cfjar-b-l5j.tfm \
tex-cfjar-b-l5j.vf \
tex-cfjar-b-t1.tfm \
tex-cfjar-b-t1.vf \
tex-cfjar-b-ts1.tfm \
tex-cfjar-b-ts1.vf \
tex-cfjar-l-l0j.tfm \
tex-cfjar-l-l0j.vf \
tex-cfjar-l-l5j.tfm \
tex-cfjar-l-l5j.vf \
tex-cfjar-l-t1.tfm \
tex-cfjar-l-t1.vf \
tex-cfjar-l-ts1.tfm \
tex-cfjar-l-ts1.vf \
tex-cfjar-r-l0j.tfm \
tex-cfjar-r-l0j.vf \
tex-cfjar-r-l5j.tfm \
tex-cfjar-r-l5j.vf \
tex-cfjar-r-t1.tfm \
tex-cfjar-r-t1.vf \
tex-cfjar-r-ts1.tfm \
tex-cfjar-r-ts1.vf \
tex-cfjas-b-l0j.tfm \
tex-cfjas-b-l0j.vf \
tex-cfjas-b-l5j.tfm \
tex-cfjas-b-l5j.vf \
tex-cfjas-b-t1.tfm \
tex-cfjas-b-t1.vf \
tex-cfjas-b-ts1.tfm \
tex-cfjas-b-ts1.vf \
tex-cfjas-r-l0j.tfm \
tex-cfjas-r-l0j.vf \
tex-cfjas-r-l5j.tfm \
tex-cfjas-r-l5j.vf \
tex-cfjas-r-t1.tfm \
tex-cfjas-r-t1.vf \
tex-cfjas-r-ts1.tfm \
tex-cfjas-r-ts1.vf \
tex-cfjas-x-l0j.tfm \
tex-cfjas-x-l0j.vf \
tex-cfjas-x-l5j.tfm \
tex-cfjas-x-l5j.vf \
tex-cfjas-x-t1.tfm \
tex-cfjas-x-t1.vf \
tex-cfjas-x-ts1.tfm \
tex-cfjas-x-ts1.vf \
tex-pxchfon.sty \
tex-pxchfon0.def \
tex-r-cfjam-r-l0j.tfm \
tex-r-cfjam-r-t1.tfm \
tex-r-cfjam-r-ts1.tfm \
tex-r-cfjam-rz-l0j.tfm \
tex-r-cfjar-b-l0j.tfm \
tex-r-cfjar-b-t1.tfm \
tex-r-cfjar-b-ts1.tfm \
tex-r-cfjar-bz-l0j.tfm \
tex-r-cfjar-l-l0j.tfm \
tex-r-cfjar-l-t1.tfm \
tex-r-cfjar-l-ts1.tfm \
tex-r-cfjar-lz-l0j.tfm \
tex-r-cfjar-r-l0j.tfm \
tex-r-cfjar-r-t1.tfm \
tex-r-cfjar-r-ts1.tfm \
tex-r-cfjar-rz-l0j.tfm \
tex-r-cfjas-b-l0j.tfm \
tex-r-cfjas-b-t1.tfm \
tex-r-cfjas-b-ts1.tfm \
tex-r-cfjas-bz-l0j.tfm \
tex-r-cfjas-r-l0j.tfm \
tex-r-cfjas-r-t1.tfm \
tex-r-cfjas-r-ts1.tfm \
tex-r-cfjas-rz-l0j.tfm \
tex-r-cfjas-x-l0j.tfm \
tex-r-cfjas-x-t1.tfm \
tex-r-cfjas-x-ts1.tfm \
tex-r-cfjas-xz-l0j.tfm \
texlive-pxchfon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-etoolbox.sty \
tex-keyval.sty \
tex-pxufont-ruby.sty \
tex-pxufont.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
