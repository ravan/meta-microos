SUMMARY = "MetaPost library for typesetting UML diagrams"
DESCRIPTION = "MetaUML is a MetaPost library for typesetting UML diagrams, \
which provides a usable, human-friendly textual notation for \
UML, offering now support for class, package, activity, state, \
and use case diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2.6svn49923"

RPM_NAME = "texlive-metauml-2026.226.0.0.2.6svn49923-61.2.noarch.rpm"
RPM_HASH = "8e29b248fcd0bac95f9b254e4bc6209f5e28e11b824b4fa496a0dd0b2b7ff85f2744a4cfcb4887c70e5cc1815c3a12b686e33d89cf90753a8c6a8ed019c89f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metauml"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
