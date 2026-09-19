SUMMARY = "Addresses on envelopes or mailing labels"
DESCRIPTION = "A LaTeX package for producing mailing envelopes and labels, \
including barcodes and address formatting according to the US \
Postal Service rules. Redefines the standard \\makelabels \
command of the LaTeX letter documentclass."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn61937"

RPM_NAME = "texlive-envlab-2026.226.1.2svn61937-61.4.noarch.rpm"
RPM_HASH = "635f90d051f3c3f8198d8ecaab4c915248c33afe2084a03e7cf17e4b3139424009f4b5dfe59c0c13c7e108404d0a3c50ce3858ca1c9a1f987d9905ed20458860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-envlab.cfg \
tex-envlab.sty \
texlive-envlab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
