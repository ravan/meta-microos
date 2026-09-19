SUMMARY = "Include whole or partial Jupyter notebooks in LaTeX documents"
DESCRIPTION = "This package provides a python3 script and a LaTeX .sty file \
which can be used together to include Jupyter Notebooks (all of \
them, or some specific cells) as part of a LaTeX document. It \
will convert the Jupyter Notebook format to proper LaTeX so it \
gets included seamlessly, supporting text, LaTeX, images, etc."
LICENSE = "Apache-1.0"

PV = "2026.226.1.1svn75037"

RPM_NAME = "texlive-jupynotex-2026.226.1.1svn75037-63.2.noarch.rpm"
RPM_HASH = "e68cf9acfbe7e9db580075cf0ada27acae9c8c5ca21b7cba0616908e512439e8030968b48529e1823507796064e8500145d200fd02f3be900e5fa8dbe2eae526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jupynotex.sty \
texlive-jupynotex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfopts.sty \
tex-tcolorbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
