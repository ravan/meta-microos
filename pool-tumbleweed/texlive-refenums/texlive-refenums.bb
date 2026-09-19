SUMMARY = "Define named items and provide back-references with that name"
DESCRIPTION = "The package provides commands to define enumerable items with a \
number and a long name, which can be referenced later with the \
name or just the short form. For instance, 'Milestone M1: \
Specification created' can be defined and later on be \
referenced with 'M1' or 'M1 ('Specification created')'. The \
text in the references is derived from the definition and also \
rendered as hyperlink to the definition."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn44131"

RPM_NAME = "texlive-refenums-2026.226.1.1.2svn44131-60.4.noarch.rpm"
RPM_HASH = "86d8a95f63a7fd1a992a0172f3ce52d4fa9dd9db48ca0abe950ed0cc0a298189e7bef0de99d6628984dd522c95e39897e9d848dac3e6fa7d161f8f269e0cca02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-refenums.sty \
texlive-refenums"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cleveref.sty \
tex-csquotes.sty \
tex-hyperref.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
