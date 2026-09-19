SUMMARY = "A collection of add-ons and bugfixes for PSTricks"
DESCRIPTION = "Collects together examples that have been posted to the \
PSTricks mailing list, together with many additional features \
for the basic pstricks, pst-plot and pst-node, including: \
bugfixes; new options for the pspicture environment; arrows; \
braces as node connection/linestyle; extended axes for plots \
(e.g., logarithm axes); polar plots; plotting tangent lines of \
curves or functions; solving and printing differential \
equations; box plots; matrix plots; and pie charts. The package \
makes use of PostScript routines provided by pst-math."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.94svn77682"

RPM_NAME = "texlive-pstricks-add-2026.226.3.94svn77682-60.4.noarch.rpm"
RPM_HASH = "b595924cb4fd47700e0a0fadc3ca5499863cf4fced49a8aeb375a19ee5cbdc9fb72e71ed9c1fd0f6a6b7736c468374c187e1eaeb46816b328fa71fb66d652a02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pstricks-add.sty \
tex-pstricks-add.tex \
texlive-pstricks-add"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pst-3d.sty \
tex-pst-calculate.sty \
tex-pst-math.sty \
tex-pst-node.sty \
tex-pst-plot.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
