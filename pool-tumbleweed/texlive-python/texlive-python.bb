SUMMARY = "Embed Python code in LaTeX"
DESCRIPTION = "The package enables you to embed Python code in LaTeX, and \
insert the script's output in the document."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.22svn60162"

RPM_NAME = "texlive-python-2026.226.0.0.22svn60162-60.4.noarch.rpm"
RPM_HASH = "20fc6a000fa93debe2b6f94cc4b40fae1e8b8b2dca7dc5ce07f482878b7108acf684cddf71204355259f656b7f9209dcf5c7d7d1a8aef59b89bf9fb42281b37e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-python.sty \
texlive-python"

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
