SUMMARY = "Typeset Python, C and Pascal programs"
DESCRIPTION = "A TeX macro package for easy typesetting programs in Python, C \
and Pascal. Program source files may also be input."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.2svn18337"

RPM_NAME = "texlive-c-pascal-2026.226.1.2svn18337-59.2.noarch.rpm"
RPM_HASH = "7f500443cdac17f4e5c5ee86c404470496e797ae0c70aa3890002ec2125703e93e02551485fc2945a14cb993fad9851d5f30c42b466f270e240e017f6847af7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cap-c.tex \
tex-cap-comm.tex \
tex-cap-pas.tex \
tex-cap-pyt.tex \
tex-cap.tex \
texlive-c-pascal"

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
