SUMMARY = "A beamer/ltx-talk inner theme to reproduce standard beamer blocks using tcolorboxes"
DESCRIPTION = "This package provides an inner theme for beamer or ltx-talk \
which reproduces standard beamer blocks using tcolorboxes. The \
look and feel (rounded/sharp corners, shadows and colours) will \
automatically adapt to which other themes are loaded."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77380"

RPM_NAME = "texlive-beamertheme-tcolorbox-2026.226.1.4svn77380-61.2.noarch.rpm"
RPM_HASH = "b523bcffb3f3d0787bd4f8e6449b6e388a7056facf10c50704fca988f6a82666ea752a96ef24e48460cad4f7111627a8a38c93a69b7821e5b54f3d0739c7bc38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerinnerthemetcolorbox.sty \
tex-talkthemetcolorbox.sty \
texlive-beamertheme-tcolorbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tcolorbox.sty \
texlive \
texlive-beamer \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tcolorbox \
texlive-tikzfill \
texlive-tools"

inherit rpm
