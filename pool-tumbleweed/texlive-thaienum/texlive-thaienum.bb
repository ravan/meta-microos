SUMMARY = "Thai labels in enumerate environments"
DESCRIPTION = "This LaTeX package provides a command to use Thai numerals or \
characters as labels in enumerate environments. Once the \
package is loaded with \\usepackage{thaienum} you can use labels \
such as \\thainum* or \\thaimultialph* in conjunction with the \
package enumitem. Concrete examples are given in the \
documentation."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.2svn44140"

RPM_NAME = "texlive-thaienum-2026.227.0.0.2svn44140-62.2.noarch.rpm"
RPM_HASH = "5db0f3b931125690c36ca594363d6fede336cd52ebc67966b6c76a92325b57a51faae2fe60794d0a8c836a30ee7dba2040d9ee95187d72cd6f1033ab3dcfd3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thaienum.sty \
texlive-thaienum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-enumitem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
