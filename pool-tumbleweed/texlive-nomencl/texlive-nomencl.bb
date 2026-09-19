SUMMARY = "Produce lists of symbols as in nomenclature"
DESCRIPTION = "Produces lists of symbols using the capabilities of the \
MakeIndex program."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.6svn77682"

RPM_NAME = "texlive-nomencl-2026.226.5.6svn77682-61.2.noarch.rpm"
RPM_HASH = "bf398f5b764127a0e0df19f2a57d5a5ff0f5af19637e1a2f5035b3df2e7cb59ed0616f19a5fc88c8bb9c53165f77f8dae44ade3ab387c09b124c9d5518294516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nomencl.sty \
texlive-nomencl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-siunitx.sty \
tex-tocbasic.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
