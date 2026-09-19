SUMMARY = "LaTeX macros for Fitch-style natural deduction"
DESCRIPTION = "The package provides macros for typesetting natural deduction \
proofs in Fitch style, with subproofs indented and offset by \
scope lines."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-fitch-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "18abd0dba869079b56ce8f868cede1bf06554f753ac2b3c5a19ff7b0516c0bada66d77477bd06a34c58e74b1d693a983d6d2b99087f52aac9659986cb2f9aa07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fitch.sty \
texlive-fitch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
