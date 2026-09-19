SUMMARY = "Lightweight class for CVs"
DESCRIPTION = "This is a lightweight class file that allows you to typeset CVs \
and resumes using LaTeX."
LICENSE = "Apache-1.0"

PV = "2026.226.2.0svn75698"

RPM_NAME = "texlive-curriculum-vitae-2026.226.2.0svn75698-61.2.noarch.rpm"
RPM_HASH = "4aaba96986ce7a61bf7ee2203cb58acaadb8c4883fb26b68d73cf02bc68bcc59053d729bfc8fea765d9873ee2f038483289baf2efbe83887d532dbc05003a065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-curriculum-vitae.cls \
texlive-curriculum-vitae"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-FiraSans.sty \
tex-article.cls \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-microtype.sty \
tex-parskip.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-titlesec.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
