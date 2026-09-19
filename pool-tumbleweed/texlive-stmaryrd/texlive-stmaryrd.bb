SUMMARY = "St Mary Road symbols for theoretical computer science"
DESCRIPTION = "The fonts were originally distributed as Metafont sources only, \
but Adobe Type 1 versions are also now available. Macro support \
is provided for use under LaTeX; the package supports the \
'only' option (provided by the somedefs package) to restrict \
what is loaded, for those who don't need the whole font."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-stmaryrd-2026.226.svn77682-64.2.noarch.rpm"
RPM_HASH = "b915e4325c7bcaf7c4ca5ceb23ab72914aff515b26db0fd5185f635e13986435d7bb5178fa9b179d80318a5d3bc639c8477bc09e082e6411afd8d4ed5932563f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Ustmry.fd \
tex-stmary10.tfm \
tex-stmary5.tfm \
tex-stmary6.tfm \
tex-stmary7.tfm \
tex-stmary8.tfm \
tex-stmary9.tfm \
tex-stmaryrd.map \
tex-stmaryrd.sty \
texlive-stmaryrd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-stmaryrd-fonts"

inherit rpm
