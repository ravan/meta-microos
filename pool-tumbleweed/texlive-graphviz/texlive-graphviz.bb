SUMMARY = "Write graphviz (dot+neato) inline in LaTeX documents"
DESCRIPTION = "The package allows inline use of graphviz code, in a LaTeX \
document."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.94svn31517"

RPM_NAME = "texlive-graphviz-2026.226.0.0.94svn31517-60.4.noarch.rpm"
RPM_HASH = "fd5a854b60f3e09518fa69bdd518a8175070c3faa50cecfd230a15d28a124bc5d6ee7fdc5f38be5eee7d91d05e3768579ad3e01f249d2f4cb7a82cb2627cadad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphviz.sty \
texlive-graphviz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-psfrag.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
