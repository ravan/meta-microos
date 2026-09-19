SUMMARY = "Identify labels which cause endless 'may have changed' warnings"
DESCRIPTION = "Several conditions can cause LaTeX labels to keep changing, no \
matter how many times a document is recompiled. This package \
helps diagnose the cause of repeated 'Label(s) may have \
changed' warnings. The names and before/after definitions of \
changing labels are printed at the end of each compile. \
Multiply-defined labels are printed as well."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-labelschanged-2026.226.1.01svn77682-63.2.noarch.rpm"
RPM_HASH = "a84771526995d8317625645ae9f097e58b974c2096f3c0b928475bdc377f8805e869d7aeb23180f270d90e59476cc013f4f9910d18142b4eb66f69e43088bb54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-labelschanged.sty \
texlive-labelschanged"

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
