SUMMARY = "A minimal method for making generic packages"
DESCRIPTION = "The package provides a minimal method for making generic (i.e., \
TeX-format-independent) packaged, combining maybeload \
functionality, fallback definitions for LaTeX \\ProvidesPackage \
and \\RequirePackage functionality, and handling of arbitrary \
(multiple) 'private letters' (analagous LaTeX packages' use of \
'@') in nested package files. The documentation contains a \
central reference for making and using generic packages based \
on the package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4asvn27765"

RPM_NAME = "texlive-plainpkg-2026.226.0.0.4asvn27765-58.2.noarch.rpm"
RPM_HASH = "d8eb4e2b5e2513d6850760e0c4394860e71cf11ae311b4c3d1a15de9ce14b7c554699eeea9a60f69f658f073d3c14dec6f936e248866e373995dc47332baa5ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plainpkg.tex \
texlive-plainpkg"

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
