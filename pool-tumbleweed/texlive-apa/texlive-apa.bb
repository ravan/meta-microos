SUMMARY = "American Psychological Association format"
DESCRIPTION = "A LaTeX class to format text according to the American \
Psychological Association Publication Manual (5th ed.) \
specifications for manuscripts or to the APA journal look found \
in journals like the Journal of Experimental Psychology etc. In \
addition, it provides regular LaTeX-like output with a few \
enhancements and APA-motivated changes. Note that the apa7 \
class (covering the 7th edition of the manual) and apa6 \
(covering the 6th edition of the manual) are now commonly in \
use. Apacite, which used to work with this class, has been \
updated for use with apa6."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.4svn54080"

RPM_NAME = "texlive-apa-2026.226.1.3.4svn54080-61.2.noarch.rpm"
RPM_HASH = "cef5b856e251105690f12fc796be3124d3f5a93b85869e330560af3b74997fa400dff87273d600917839f30f8f1a955860eb6431f175e83dc77c21e2b537b24c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apa.cls \
texlive-apa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-apacite.sty \
tex-article.cls \
tex-babel.sty \
tex-bm.sty \
tex-endfloat.sty \
tex-endnotes.sty \
tex-flushend.sty \
tex-ftnright.sty \
tex-longtable.sty \
tex-mathptm.sty \
tex-pslatex.sty \
tex-times.sty \
tex-txfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
