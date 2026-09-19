SUMMARY = "Wrap text around figures"
DESCRIPTION = "This package is a fork of Donald Arseneau's wrapfig package. It \
is backwards compatible with the original environments. \
Therefore this package does not work with LaTeX2e kernels older \
than about 2018, although a warning is issued if the LaTeX \
format file is dated with a date older than 1st January 2019."
LICENSE = "LPPL-1.0"

PV = "2026.226.7.0.2svn77682"

RPM_NAME = "texlive-wrapfig2-2026.226.7.0.2svn77682-59.4.noarch.rpm"
RPM_HASH = "257e5051af385bce806a3221b36800a6e8500b9d64a16d724288e51c7461bdefe45644355b5e93d6226ce5481189414a1376608763135ccf2e02c1161b1ec82a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wrapfig2.sty \
texlive-wrapfig2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-float.sty \
tex-pict2e.sty \
tex-xcolor.sty \
tex-xfp.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-float \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pict2e \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
