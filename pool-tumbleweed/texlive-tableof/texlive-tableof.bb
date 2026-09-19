SUMMARY = "Tagging tables of contents"
DESCRIPTION = "The package provides the commands to flag chapters or sections \
(or anything else destined to become a TOC line). The command \
\\nexttocwithtags{req1,req2,...}{excl1,excl2,...} specifies \
which tags are to be required and which ones are to be excluded \
by the next \\tableofcontents (or equivalent) command. In a \
document that uses a class where \\tableofcontents may only be \
used once, the command \
\\tableoftaggedcontents{req1,req2,...}{excl1,excl2,...} may be \
used to provide several tables."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4dsvn77682"

RPM_NAME = "texlive-tableof-2026.226.1.4dsvn77682-64.2.noarch.rpm"
RPM_HASH = "f57aeace5ab9010bb6ccd10f901f1788815199541d3ca352c12f493579ee80419325e162505c97da5068fdafbd9a73fe67e9d7d1b97848abade32aa9332696c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tableof.sty \
texlive-tableof"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
