SUMMARY = "Decorative swelled rule using font character"
DESCRIPTION = "The package implements a decorative swelled rule using only a \
symbol from a font installed with all distributions of TeX, so \
it works independently, without the need to install any \
additional software or fonts. This is the packaged version of \
the macro which was originally published in the 'Typographers' \
Inn' column in TUGboat 31:1 (2010)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-decorule-2026.226.0.0.7svn77682-59.2.noarch.rpm"
RPM_HASH = "426da73bd5753bfe2903dfe6953e75112e0930e1b170efb2476b4ce415989e5e163ce1aa22a21a10a80a77fa75bb993d2ae3ca00873d06deb82f0bd38bdb075d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-decorule.sty \
texlive-decorule"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fix-cm.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
