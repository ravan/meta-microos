SUMMARY = "Create proficiency tests"
DESCRIPTION = "This package attempts to make it easy for even a LaTeX novice \
to prepare proficiency tests, especially in combination with \
the exam document class. Thus, almost all command names are \
very similar. After defining skills in the preamble or in an \
external file, they are declared using labels, and can \
optionally be set as global skills. A skills table is generated \
to summarize the evaluated competencies and to allow for \
writing down the resulting proficiency level. A user's guide \
attempts to explain all of the possibilities in a readable way, \
with many examples."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn56734"

RPM_NAME = "texlive-skills-2026.226.1.0.0svn56734-64.2.noarch.rpm"
RPM_HASH = "4cf6562e64c35d803b5e9428e1511da6ed629493ae91eb8af8a0f6aaaa72c661ead39b2902aa2b04ad75711884110c2b30223254be8dcc1e4a81468c9ba0d3e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skills.sty \
texlive-skills"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-glossaries.sty \
tex-iftex.sty \
tex-kvoptions.sty \
tex-marginnote.sty \
tex-tabularx.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
