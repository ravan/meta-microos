SUMMARY = "Access different-shaped small-caps fonts"
DESCRIPTION = "This package enables the use of small capitals in different \
font shapes, e.g., slanted or bold slanted for all fonts that \
provide appropriate font shapes. (Note that a separate .fd file \
is needed to define font shapes such as 'scsl' or 'scit'.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.11svn77682"

RPM_NAME = "texlive-slantsc-2026.226.2.11svn77682-64.2.noarch.rpm"
RPM_HASH = "1a3f6d34a77d6eec7241d2ff373dca0582748f20d09f80fb2dceac572127663a91d7aac085869d8c782cb295878a4ce042b0cd6ce2e15ba9f8665c28c9b3028e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-slantsc.sty \
texlive-slantsc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
