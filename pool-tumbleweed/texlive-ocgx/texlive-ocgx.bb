SUMMARY = "Use OCGs within a PDF document without JavaScript"
DESCRIPTION = "The package extends the ocg package, which allows you to create \
OCGs (Optional Content Groups) in PDF documents. (The ocg \
package is distributed as part of Asymptote.) Every OCG \
includes TeX material into a layer of the PDF file. Each of \
these layers can be displayed or not. Links can enable or \
disable the display of OCGs. The ocgx package does not use \
Javascript embedded in the PDF document to enable (to show) or \
disable (to hide) OCGs."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn54512"

RPM_NAME = "texlive-ocgx-2026.226.0.0.5svn54512-61.2.noarch.rpm"
RPM_HASH = "6e9cfab1790addfea25d7f5a5f6efad673ef24029fcf21256c2f9bead3c7c6e3c0de91709c850012132ffd8d083955d605643f847b5638d69b2bc71a40503d84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ocgx.sty \
tex-tikzlibraryocgx.code.tex \
texlive-ocgx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ocg-p.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
