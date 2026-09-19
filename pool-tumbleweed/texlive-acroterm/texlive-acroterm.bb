SUMMARY = "Manage and index acronyms and terms"
DESCRIPTION = "Yet another package for acronyms: the package offers simple \
markup of acronyms and technical terms in the text, giving an \
index each of terms and acronyms with their expanded form."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn61719"

RPM_NAME = "texlive-acroterm-2026.226.0.0.1svn61719-61.2.noarch.rpm"
RPM_HASH = "05a226c60c435a808456f8673b9aac1d590e612ec7fafbc50b302a11397a6e19b3ce5aa0b9fbec709c47daf19379edefbc339014e525991d6266b606d8109b71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-acroterm.sty \
texlive-acroterm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-splitidx.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
