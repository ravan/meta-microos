SUMMARY = "Set up Japanese font families for XeLaTeX"
DESCRIPTION = "The zxjafont package"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-zxjafont-2026.226.1.3svn77682-59.4.noarch.rpm"
RPM_HASH = "c3e2364c501d786389abbae8bde825849db8146f103ca0d65740ece996d69255e4e6e4bb68793624dc88b63e87e2c81ea56e72b6dcfe0c9d7e548af11a943249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zxjafont.sty \
texlive-zxjafont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-ifxetex.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
