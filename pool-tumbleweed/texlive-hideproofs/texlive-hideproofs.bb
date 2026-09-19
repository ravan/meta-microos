SUMMARY = "Defines a starred proof environment that hides proofs in draft mode"
DESCRIPTION = "This package introduces an alternate proof environment, proof*, \
which conditionally hides or shows its contents based on the \
document mode (draft, final, or default). This is useful for \
omitting formal proofs from draft versions while retaining them \
in final documents. The motivation for this package is to \
reduce the clutter in large files by omitting long proofs, \
allowing authors to focus their attention on results or proofs \
that are currently works in progress."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75712"

RPM_NAME = "texlive-hideproofs-2026.226.1.0svn75712-60.4.noarch.rpm"
RPM_HASH = "73e05c00b0dbc4296a4d070df26bc6093202743aa2f91196ed34f0725e62929fac4577cb84d452555bdc2084571dfeaf59fc941254291e447e052b218c9e7f97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hideproofs.sty \
texlive-hideproofs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-environ.sty \
tex-expl3.sty \
tex-ifdraft.sty \
tex-ifthen.sty \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
