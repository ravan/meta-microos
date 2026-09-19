SUMMARY = "A LaTeX cheat sheet, in Brazilian Portuguese"
DESCRIPTION = "This is a translation to Brazilian Portuguese of Winston \
Chang's LaTeX cheat sheet"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.13svn15878"

RPM_NAME = "texlive-latexcheat-ptbr-2026.226.1.13svn15878-61.2.noarch.rpm"
RPM_HASH = "de0e7e52aa5ab998717ec37ed6a7b87bbb8c16ae12a4f9b2d9c29b1e61f3d118ca184a401b386ae956b4c6890a394a54a801ced9dc2977bd3441cfbfc5dad28f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcheat-ptbr"

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
