SUMMARY = "'Poor man's' graphics"
DESCRIPTION = "A set of extensions to LaTeX picture environment, including a \
wider range of vectors, and a lot more box frame styles."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-pmgraph-2026.226.1.0svn15878-59.2.noarch.rpm"
RPM_HASH = "f6a4e6aefd48d457d09ce8c850823f23ab997f3d438c403bfa8104532811c858a3cc43b14df74a7cfd42b61b6568c253d089938cd7bb5f4b65c4737139606a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pmgraph.sty \
texlive-pmgraph"

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
