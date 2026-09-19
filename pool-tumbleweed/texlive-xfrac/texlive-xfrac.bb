SUMMARY = "Split-level fractions"
DESCRIPTION = "This package uses the interface defined by LaTeX templates to \
provide flexible split-level fractions via the \\sfrac macro. \
This is both a demonstration of the power of the template \
concept and also a useful addition to the available \
functionality in LaTeX2e."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-xfrac-2026.226.svn77682-59.4.noarch.rpm"
RPM_HASH = "86b9a90a2823bb693455cbdc97651251c1c399e1a76cd74880184c3b114914949f8e1f8f09cfe4ccd8612d2273dc0bd662239bda12da5180276158a4106a4bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xfrac.sty \
texlive-xfrac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-expl3.sty \
tex-graphicx.sty \
tex-l3keys2e.sty \
tex-textcomp.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
