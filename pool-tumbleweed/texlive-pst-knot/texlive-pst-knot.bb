SUMMARY = "PSTricks package for displaying knots"
DESCRIPTION = "The package can produce a fair range of knot shapes, with all \
the standard graphics controls one expects."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn16033"

RPM_NAME = "texlive-pst-knot-2026.226.0.0.2svn16033-59.2.noarch.rpm"
RPM_HASH = "553a4064e780a697a130a3e32b2ad352215c6ebad606a9ebd2a7087d1ba9540dfb2eacf111f5ad99479fca19c6303d7180f001efeb30f449f5027d5ad0f7b195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-knot.sty \
tex-pst-knot.tex \
texlive-pst-knot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
