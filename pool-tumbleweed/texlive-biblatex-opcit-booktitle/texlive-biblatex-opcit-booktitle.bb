SUMMARY = "Use op. cit. for the booktitle of a subentry"
DESCRIPTION = "The default citation styles verbose-trad1+; verbose-trad2 ; \
verbose-trad3 use the op. cit. form in order to have a shorter \
reference when a title has already been cited. However, when \
you cite two entries which share the same booktitle but not the \
same title, the op. cit. mechanism does not work. This package \
enables to obtain references like this: Author1, Title, in \
Booktitle, Location, Publisher, Year, pages xxx Author2, \
Title2, in Booktitle, op. cit, pages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.0svn76790"

RPM_NAME = "texlive-biblatex-opcit-booktitle-2026.226.1.9.0svn76790-61.2.noarch.rpm"
RPM_HASH = "8c7c7e4d97836f9b6749eb469c43f64b8f953e0ac203da0017a4e0a8aeeac7618711a2b8a5855be2de1962e49eefa1139fc01d04cf19e2734f177ed77b363e2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-opcit-booktitle.sty \
texlive-biblatex-opcit-booktitle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ltxcmds.sty \
tex-xkeyval.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
