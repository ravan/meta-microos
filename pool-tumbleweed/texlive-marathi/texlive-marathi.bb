SUMMARY = "Typeset Marathi language using XeLaTeX or LuaLaTeX"
DESCRIPTION = "luaa-laattek v jhii-laattek hyaaNcyaash mraatthiicaa sulbh \
vaapr krnnyaasaatthii. laattek-vriil mraatthiicyaa \
sthaanikiikrnnaace kaam hyaa aajnyaasNcaamaarpht kele jaaiil. \
expex v blindtext hyaa aajnyaasNcaaNce sthaanikiikrnn tuurtaas \
hyaa aajnyaasNcaamaarpht purvle jaat aahe. For conveniently \
typesetting Marathi language with LuaLaTeX and XeLaTeX. This \
package will provide localizations needed for the Marathi \
language. Currently the package localizes package blindtext and \
package expex."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.7svn61719"

RPM_NAME = "texlive-marathi-2026.226.1.7svn61719-59.2.noarch.rpm"
RPM_HASH = "eb11f0ce64aa7deb3ef3d2df79c89a761fd50e00af36139171dc57ae3d93393b5a89dcfb4f061d5ade2231a9313baa21b34aa86ee28cc3209cf4afd5225fa78b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-marathi.sty \
tex-namuna-article.tex \
tex-namuna-beamer.tex \
tex-namuna-book.tex \
tex-namuna-letter.tex \
tex-namuna-para.tex \
tex-namuna-report.tex \
texlive-marathi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-csquotes.sty \
tex-fontspec.sty \
tex-iftex.sty \
tex-pgfkeys.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
