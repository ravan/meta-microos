SUMMARY = "Typeset vectors and matrices following the RIGID notation"
DESCRIPTION = "This package provides LaTeX macros to easily and concisely \
typeset vectors and matrices in a flexible way such as to \
follow the RIGID notation convention. The package enables the \
user to define custom commands that can then be used in any \
math-mode environment to efficiently and rigorously typeset the \
notational elements commonly used in robotics research (and \
many other fields) for position vectors, rotation matrices, \
pose matrices, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn71264"

RPM_NAME = "texlive-rigidnotation-2026.226.1.0.0svn71264-60.4.noarch.rpm"
RPM_HASH = "a4d19292fbef2a5f455e59deca33dd01974ebfdda8a6b456337fabde51cee98eb0a5bab82d7b46e7e8dc0236f88e19205f348344ee9ea4b8d905289d52d1cc9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rigidnotation.sty \
texlive-rigidnotation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-mathtools.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3packages \
texlive-mathtools \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
