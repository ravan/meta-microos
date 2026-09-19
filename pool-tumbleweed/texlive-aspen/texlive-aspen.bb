SUMMARY = "Simple crypto notation in LaTeX"
DESCRIPTION = "The Aspen package implements LaTeX commands closely related to \
what is often called security protocol notation, standard \
protocol engineering notation, standard protocol notation, or \
protocol narrations. Optionally, the Aspen package also \
implements LaTeX commands for Burrows-Abadi-Needham logic (BAN \
logic). The name Aspen can be an abbreviation for A Security \
Protocol Engineering Notation, but another possible \
abbreviation is Anderson-inspired Standard Protocol Engineering \
Notation, in memory of the late Professor Ross J. Anderson who \
has meant so much for the fields of computer security, \
distributed systems, and, in particular, security engineering."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.27svn78101"

RPM_NAME = "texlive-aspen-2026.226.1.27svn78101-60.2.noarch.rpm"
RPM_HASH = "1b36e5dd21070599d33cf1e2a281b4d726f08c59024ee5654afe38daff21395e68765ec4b1baf29466af7f581da625a8eed4aaeb496447aec4394c4315c9a601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aspen.sty \
texlive-aspen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-mathtools.sty \
tex-rcs.sty \
tex-stmaryrd.sty \
tex-suffix.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
