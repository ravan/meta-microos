SUMMARY = "Add picture to title page of a document"
DESCRIPTION = "The package allows you to place a picture on the title page \
(cover page) of a LaTeX document. Example of usage: \
\\usepackage[cc]{titlepic} \\usepackage{graphicx} \
\\titlepic{\\includegraphics[width=\\textwidth]{picture.png}} The \
package currently only works with the document classes article, \
report and book."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.2svn43497"

RPM_NAME = "texlive-titlepic-2026.226.1.2svn43497-59.2.noarch.rpm"
RPM_HASH = "71228be3010de47970d4d2a099d5afd871b7e1e24510f47f1f06a48df658a3090a9c415c6fb1d509bc191b66640693686de4bd1cc45e3613b414b2d7416db1e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titlepic.sty \
texlive-titlepic"

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
