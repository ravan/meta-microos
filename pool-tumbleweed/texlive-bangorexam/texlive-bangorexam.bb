SUMMARY = "Typeset an examination at Bangor University"
DESCRIPTION = "The package allows typesetting of Bangor University's exam \
style. It currently supports a standard A/B choice, A-only \
compulsory and 'n' from 'm' exam styles. Marks are totalled and \
checked automatically."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6.0svn76924"

RPM_NAME = "texlive-bangorexam-2026.226.1.6.0svn76924-60.2.noarch.rpm"
RPM_HASH = "758479d4308bae86ae0c5ce232bb8ab479616eb221a64c1d5d210a3f3e59d7ddfa70ec85af6601336ed862846e2140f12deb50af62e4aed4b3995c8691377667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bangorexam.cls \
texlive-bangorexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-babel.sty \
tex-color.sty \
tex-courier.sty \
tex-etoolbox.sty \
tex-exam.cls \
tex-fontenc.sty \
tex-forloop.sty \
tex-graphicx.sty \
tex-inputenc.sty \
tex-isodate.sty \
tex-letltxmacro.sty \
tex-newpxmath.sty \
tex-newpxtext.sty \
tex-tikz.sty \
tex-totcount.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
