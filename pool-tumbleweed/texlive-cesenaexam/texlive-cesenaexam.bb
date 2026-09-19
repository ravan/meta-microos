SUMMARY = "A class file to typeset exams"
DESCRIPTION = "This LaTeX document class has been designed to typeset exams."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn44960"

RPM_NAME = "texlive-cesenaexam-2026.226.0.0.2svn44960-59.2.noarch.rpm"
RPM_HASH = "acc7358d89e095a26b20a4ae61b4696bdcf75959b0c2208f6a4b78c40b1648bd6b6d6acbd3a35c4a082a20e7aaec837dce7be7bf2da6b6af1901af1cc2cf64fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cesenaexam.cls \
tex-cesenaexam.sty \
texlive-cesenaexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-circuitikz.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-tikz.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
