SUMMARY = "A short introduction to LaTeX installation written in Chinese"
DESCRIPTION = "This package will introduce the operations related to \
installing TeX Live (introducing MacTeX in macOS), upgrading \
packages, and compiling simple documents on Windows 11, Ubuntu \
24.04, and macOS systems, and mainly introducing command line \
operations."
LICENSE = "LPPL-1.0"

PV = "2026.226.2026.3.1svn78227"

RPM_NAME = "texlive-install-latex-guide-zh-cn-2026.226.2026.3.1svn78227-60.2.noarch.rpm"
RPM_HASH = "ba1180dfdb4eb48f4f5c10ca7fcfbc6ea30b800366a1f5ebd6eb11109cb4967cbcc4692a2d6b2cd160687aeeca9597339d5fa18ff833da190d4df85c0e1ea0c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-install-latex-guide-zh-cn"

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
