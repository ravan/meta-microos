SUMMARY = "Embed source files into the generated PDF"
DESCRIPTION = "The package provides a means of storing a project, without \
losing anything. It uses the embedfile package to attach to the \
generated PDF all files used in creating your project. In \
particular, it can embed images, external TeX files, external \
codes and"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn51177"

RPM_NAME = "texlive-embedall-2026.226.2.0svn51177-61.4.noarch.rpm"
RPM_HASH = "e4fe35f12aa44a9acabe074fb1d83ccf91c2d14fa546a041396504fe5d59439638fb513fba16ff85c80680bcbf7ac21f5f98ec892a043c5438422742515641a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-embedall.sty \
texlive-embedall"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-embedfile.sty \
tex-etoolbox.sty \
tex-filehook.sty \
tex-letltxmacro.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
