SUMMARY = "Command line application to convert .bib files to glossaries-extra.sty resource files"
DESCRIPTION = "This Java command line application may be used to extract \
glossary information stored in a .bib file and convert it into \
glossary entry definition commands. This application should be \
used with glossaries-extra.sty's 'record' package option. It \
performs two functions in one: selects entries according to \
records found in the .aux file (similar to bibtex), \
hierarchically sorts entries and collates location lists \
(similar to makeindex or xindy). The glossary entries can then \
be managed in a system such as JabRef, and only the entries \
that are actually required will be defined, reducing the \
resources required by TeX. The supplementary application \
convertgls2bib can be used to convert existing .tex files \
containing definitions (\\newglossaryentry etc.) to the .bib \
format required by bib2gls."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.4.7svn76845"

RPM_NAME = "texlive-bib2gls-2026.226.4.7svn76845-61.2.noarch.rpm"
RPM_HASH = "52286490ec3bdafbf7135a5e5fc8a1f96f2796746deff7619e209f6b55d45dde393a73cd97ee98b102036bec2dfdc428bceea94f9abf2dfee7d76f74a0446e3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bib2gls.jar \
tex-bibglscommon.jar \
tex-convertgls2bib.jar \
tex-datatool2bib.jar \
tex-texparserlib.jar \
texlive-bib2gls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
sed \
texlive \
texlive-bib2gls-bin \
texlive-filesystem \
texlive-glossaries-extra \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
