SUMMARY = "Set table of contents in multiple columns"
DESCRIPTION = "The package automatically sets the table of contents, list of \
figures and list of tables in two or more columns (the number \
of columns may be configured). The package uses the multicol \
package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.02svn77682"

RPM_NAME = "texlive-multitoc-2026.226.2.02svn77682-61.2.noarch.rpm"
RPM_HASH = "793b130605a0bad5baf0d4c5faee3505f3544b69491b5b9f91b92e00c0d4a8a7e29a6a762bf475be31357cf3d163177f905e846ffb22c6cefb245440f110c9f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multitoc.sty \
texlive-multitoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
