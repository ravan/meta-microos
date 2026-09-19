SUMMARY = "German localization for termcal"
DESCRIPTION = "This package provides a German localization to the termcal \
package written by Bill Mitchell, which is intended to print a \
term calendar for use in planning a class. termcal-de depends \
on the following other packages: termcal, pgfkeys, pgfopts, \
datetime2, and datetime2-german."
LICENSE = "LPPL-1.0"

PV = "2026.227.2.0svn47111"

RPM_NAME = "texlive-termcal-de-2026.227.2.0svn47111-62.2.noarch.rpm"
RPM_HASH = "9f02bfbb04bc4bc2feca72c7c78bb416b16367c67fa39b26327ceca6f691e04360938d669cf49f304ce4b2442a9295680bc5dab60e316f4f7b78fa0e9fb67c21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-termcal-de.sty \
texlive-termcal-de"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datetime2.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-termcal.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
