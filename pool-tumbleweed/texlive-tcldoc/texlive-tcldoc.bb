SUMMARY = "Doc/docstrip for tcl"
DESCRIPTION = "The tclldoc package and class simplify the application of the \
doc/docstrip style of literate programming with Dr. John \
Ousterhout's Tool Command Language (Tcl, pronounced 'tickle', \
a.k.a. The Cool Language). The tclldoc package is a bit like \
the doc package is for LaTeX, whereas the tclldoc class more \
parallels the ltxdoc class."
LICENSE = "LPPL-1.0"

PV = "2026.227.2.40svn22018"

RPM_NAME = "texlive-tcldoc-2026.227.2.40svn22018-62.2.noarch.rpm"
RPM_HASH = "d667761a7f814d7b5a796ffe25781b9dcf199649ece36eb8869e3f5f96f8184dcaf748c976af65689140cd058285343637779babeb1311cca69d89beee4de50f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tcldoc.cls \
tex-tcldoc.sty \
tex-tclldoc.cls \
tex-tclldoc.sty \
texlive-tcldoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-docidx2e.sty \
tex-rtkinenc.sty \
tex-xdoc2.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
