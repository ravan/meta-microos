SUMMARY = "Timelines for use with moderncv"
DESCRIPTION = "The package provides commands to configure and to draw time \
line diagrams; such diagrams are designed to fit into \
Curriculum Vitae documents written using the moderncv class."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn55518"

RPM_NAME = "texlive-moderntimeline-2026.226.0.0.11svn55518-61.2.noarch.rpm"
RPM_HASH = "9a721e9a8a5fdcea23b9c9272ab91a9e12dee3714cf175b9c0a01361c903cd91bcd66537b3b9e7e7ee7906240afcfd853108c8a15eae665ffc5d71f69daf48a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-moderntimeline.sty \
texlive-moderntimeline"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
