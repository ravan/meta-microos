SUMMARY = "Packages and image files for MWEs"
DESCRIPTION = "The bundle provides several files useful when creating a \
minimal working example (MWE). The package itself loads a small \
set of packages often used when creating MWEs. In addition, a \
range of images are provided, which will be installed in the \
TEXMF tree, so that they may be used in any (La)TeX document. \
This allows different users to share MWEs which include image \
commands, without the need to share image files or to use \
replacement code."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn77682"

RPM_NAME = "texlive-mwe-2026.226.0.0.5svn77682-61.2.noarch.rpm"
RPM_HASH = "4152582e09bb2a03ae0381f7081717cd70d42e0b628d9ab66abc9f26de1a016f7311b2123d01ac7eefa449f45c744416be4986adbbffc9055905193869bd3e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-example-grid-100x100bp.tex \
tex-example-grid-100x100pt.tex \
tex-example-image-10x16.tex \
tex-example-image-16x10.tex \
tex-example-image-16x9.tex \
tex-example-image-1x1.tex \
tex-example-image-4x3.tex \
tex-example-image-9x16.tex \
tex-example-image-a.tex \
tex-example-image-a3-landscape.tex \
tex-example-image-a3.tex \
tex-example-image-a4-landscape.tex \
tex-example-image-a4-numbered.tex \
tex-example-image-a4.tex \
tex-example-image-a5-landscape.tex \
tex-example-image-a5.tex \
tex-example-image-b.tex \
tex-example-image-c.tex \
tex-example-image-empty.tex \
tex-example-image-golden-upright.tex \
tex-example-image-golden.tex \
tex-example-image-letter-landscape.tex \
tex-example-image-letter-numbered.tex \
tex-example-image-letter.tex \
tex-example-image-plain.tex \
tex-example-image.tex \
tex-example-movie.tex \
tex-mwe.sty \
texlive-mwe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-blindtext.sty \
tex-graphicx.sty \
tex-lipsum.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
