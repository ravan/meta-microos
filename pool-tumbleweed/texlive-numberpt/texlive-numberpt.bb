SUMMARY = "Counters spelled out in Portuguese"
DESCRIPTION = "This packages defines commands to display counters spelled out \
in Portuguese. The styles are \\numberpt for 'all lowercase' \
\\Numberpt for 'First word capitalized' \\NumberPt for 'All \
Capitalized' \\NUMBERPT for 'ALL UPPERCASE' For example, \
\\renewcommand{\\thechapter}{\\NumberPt{chapter}} makes chapter \
titles to be rendered as 'Capitulo Um', 'Capitulo Dois' etc. \
Options are offered to select variations in the spelling of \
'14', or Brazilian vs. European Portuguese forms in the \
spelling of '16', '17', and '19'. The package requires expl3 \
and xparse."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-numberpt-2026.226.1.0svn76924-61.2.noarch.rpm"
RPM_HASH = "b0be4596240f25bfe4819a2f9651df6d562f548601a979671aa8ca98d8f4f7c5af4734a4119a18a071991d6bcc833375d15ff4f1eea6e23405c010e1ce8f0b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numberpt.sty \
texlive-numberpt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
