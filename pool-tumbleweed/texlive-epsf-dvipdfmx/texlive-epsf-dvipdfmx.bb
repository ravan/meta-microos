SUMMARY = "Plain TeX file for using epsf.tex with (x)dvipdfmx"
DESCRIPTION = "epsf-dvipdfmx.tex is a plain TeX file to be \\input after \
epsf.tex when using plain TeX with dvipdfmx. As in: \\input epsf \
\\input epsf-dvipdfmx It is needed when an .eps file has \
anything except the origin (0,0) for the lower-left of its \
bounding box."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2014svn35575"

RPM_NAME = "texlive-epsf-dvipdfmx-2026.226.2014svn35575-61.4.noarch.rpm"
RPM_HASH = "0976886e36db28a3bd0005fcf6ca3aaa06fad484c67c4a344f17b33cd420f99d4e5ed44797c8a374ba7c8422303f2d5a85422aaab23d806d2d4c89399608fbdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epsf-dvipdfmx.tex \
texlive-epsf-dvipdfmx"

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
