SUMMARY = "PostScript versions of the ESSTIX, with macro support"
DESCRIPTION = "These fonts represent translation to PostScript Type 1 of the \
ESSTIX fonts. ESSTIX seem to have been a precursor to the STIX \
project, and were donated by Elsevier to that project. The \
accompanying virtual fonts with customized metrics and LaTeX \
support files allow their use as calligraphic, fraktur and \
double-struck (blackboard bold) in maths mode."
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-esstix-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "dc01f1c7810086bd231c183376d2db255555fc9e5067656b4499ca05e573b01139f58b7830fc9972c6c492a2e4091e83d733721a689c4c6e6465ecf25f16cfdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ESSTIX.map \
tex-esstixbb.sty \
tex-esstixbb.tfm \
tex-esstixbb.vf \
tex-esstixcal.sty \
tex-esstixcal.tfm \
tex-esstixcal.vf \
tex-esstixfrak.sty \
tex-esstixfrak.tfm \
tex-esstixfrak.vf \
tex-rESSTIX13.tfm \
tex-rESSTIX14.tfm \
tex-rESSTIX15.tfm \
tex-uesstixbb.fd \
tex-uesstixcal.fd \
tex-uesstixfrak.fd \
texlive-esstix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmr10.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-esstix-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
