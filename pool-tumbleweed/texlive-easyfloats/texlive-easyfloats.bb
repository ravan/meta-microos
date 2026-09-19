SUMMARY = "An easier interface to insert figures, tables and other objects in LaTeX"
DESCRIPTION = "In standard LaTeX inserting objects like figures or tables \
requires too much knowledge for beginners and too much typing \
effort and hardcoding for people like me. This package aims to \
make insertion of figures and tables easier for both beginners \
and experts. Despite the term 'floats' in its name, it also \
allows to disable floating of such objects."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn72699"

RPM_NAME = "texlive-easyfloats-2026.226.1.1.0svn72699-61.4.noarch.rpm"
RPM_HASH = "c6a9b442f804c43471f60189b92e5c425bbc9f173d1e8093091a4f0017eba62643431533b6dd510c983324d1ded0546ffc340fc5362e2799771605fdf6b33b51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easyfloats.sty \
texlive-easyfloats"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-graphbox.sty \
tex-graphicx.sty \
tex-longtable.sty \
tex-pgfkeys.sty \
tex-subcaption.sty \
texlive \
texlive-caption \
texlive-environ \
texlive-etoolbox \
texlive-filesystem \
texlive-float \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
