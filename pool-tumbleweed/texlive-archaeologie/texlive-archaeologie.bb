SUMMARY = "A citation-style which covers rules of the German Archaeological Institute"
DESCRIPTION = "This citation-style covers the citation and bibliography rules \
of the German Archaeological Institute (DAI). Various options \
are available to change and adjust the outcome according to \
one's own preferences."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5.0svn76790"

RPM_NAME = "texlive-archaeologie-2026.226.2.5.0svn76790-61.2.noarch.rpm"
RPM_HASH = "a401e218aaf5b225f79eb8f1e9723cf19c16b2a15d5d8b6f7ee3cee5c2ee28f4ce36b4e4a8fefad3f5b9e5d2a39e89f15dd537350376127a6b5d16ad6be39d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-archaeologie.bbx \
tex-archaeologie.cbx \
tex-english-archaeologie.lbx \
tex-french-archaeologie.lbx \
tex-german-archaeologie.lbx \
tex-italian-archaeologie.lbx \
tex-spanish-archaeologie.lbx \
texlive-archaeologie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-standard.bbx \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
