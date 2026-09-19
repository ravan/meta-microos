SUMMARY = "A different view of the ClassicThesis package"
DESCRIPTION = "The package changes some typographical points of the \
ClassicThesis style, by Andre Miede. It enables the user to \
reproduce the look of the guide The art of writing with LaTeX \
(the web page is in Italian)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45656"

RPM_NAME = "texlive-arsclassica-2026.226.svn45656-60.2.noarch.rpm"
RPM_HASH = "a623d43144b5a1d451da7f954bc815e37734b2459f441b21565f7d4c4ecee2f23193a3e60de7577768f3a4617eb62edaa04c8ee8fb962dc2427f4f73695f7758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arsclassica.sty \
texlive-arsclassica"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-classicthesis.sty \
tex-soul.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
