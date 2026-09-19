SUMMARY = "Make letter-sized pages of labels"
DESCRIPTION = "The package provides controls for the numbers of rows and \
columns."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn24858"

RPM_NAME = "texlive-jlabels-2026.226.svn24858-63.2.noarch.rpm"
RPM_HASH = "0c8383caf416f5688a76865b3387e22187e82504f07f80a6cdca3865766693b1865465862f091f8aeae34d67fbd901234d823444bcb10e8d9ccb12a94936e09d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jlabels.sty \
texlive-jlabels"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
