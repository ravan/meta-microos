SUMMARY = "Macros for documentation of LaTeX classes and packages"
DESCRIPTION = "The package provides macros and environments to document LaTeX \
packages and classes. It is an (as yet unfinished) alternative \
to the ltxdoc class and the doc or xdoc packages. The aim is to \
provide a different layout and more modern styles (using the \
xcolor, hyperref packages, etc.) This is an alpha release, and \
should probably not (yet) be used with other packages, since \
the implementation might change. Nevertheless, the author uses \
it to document his own packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7alphasvn64887"

RPM_NAME = "texlive-ydoc-2026.226.0.0.7alphasvn64887-59.4.noarch.rpm"
RPM_HASH = "c8ecbc7f9d1faafc7b700267e9c902eb47ec49bfc23dcbdcf5e93d1b7006652d347cc11bc9d11ed17bbc60485a61a8fc35f5856daf3e815b2b02777f5b731583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ydoc-code.sty \
tex-ydoc-desc.sty \
tex-ydoc-doc.sty \
tex-ydoc-expl.sty \
tex-ydoc.cfg \
tex-ydoc.cls \
tex-ydoc.sty \
tex-ydocincl.tex \
tex-ydocstrip.tex \
texlive-ydoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-etoolbox.sty \
tex-float.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-needspace.sty \
tex-newverbs.sty \
tex-shortvrb.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-float \
texlive-hyperref \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-listings \
texlive-needspace \
texlive-newverbs \
texlive-scripts \
texlive-scripts-bin \
texlive-showexpl \
texlive-tools \
texlive-url \
texlive-xcolor"

inherit rpm
