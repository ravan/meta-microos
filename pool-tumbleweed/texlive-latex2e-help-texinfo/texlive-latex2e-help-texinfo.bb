SUMMARY = "Unofficial reference manual covering LaTeX2e"
DESCRIPTION = "The manual is provided as Texinfo source (which was originally \
derived from the VMS help file in the DECUS TeX distribution of \
1990, with many subsequent changes). This is a collaborative \
development, and details of getting involved are to be found on \
the package home page. A Spanish translation is included here, \
and a French translation is available as a separate package. \
All the other formats in the distribution are derived from the \
Texinfo source, as usual."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71252"

RPM_NAME = "texlive-latex2e-help-texinfo-2026.226.svn71252-61.2.noarch.rpm"
RPM_HASH = "69b4c425c9f6b3a02eba3d8cd7cb126d97a78b481aa2ea551f84cbfa8db64ea05e423fc8eaed41bd5ff29d90d9b149f399c697c910f9caca89d9a7320aa1fd71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex2e-help-texinfo"

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
