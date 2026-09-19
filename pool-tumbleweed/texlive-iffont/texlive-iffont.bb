SUMMARY = "Conditionally load fonts with fontspec"
DESCRIPTION = "This package provides a macro to select the first font XeLaTeX \
or LuaTeX can find in a comma separated list and, additionally, \
a number of macro tests."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn38823"

RPM_NAME = "texlive-iffont-2026.226.1.0.0svn38823-60.2.noarch.rpm"
RPM_HASH = "5dc2c7823730029e94aac846b5facbff86f5f62e9b315144e6665fe82afda0fd897bd91ba2d6fbc698e42ac1e0a4a16bd9901614aa781b246bba85ca0066f5fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iffont.sty \
texlive-iffont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
