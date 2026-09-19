SUMMARY = "Macros for typesetting Object Z"
DESCRIPTION = "The package will typeset both Z and Object-Z specifications; it \
develops the original zed package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn61719"

RPM_NAME = "texlive-objectz-2026.226.svn61719-61.2.noarch.rpm"
RPM_HASH = "dfcee3dad06f711cfb452e695870ba2ff79df7a3b44c5816949c828106391f2801bcb410dcc2afd93633cbfb8eb8256ed66b91767877ba49ee0aba2e284afbdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oz.sty \
texlive-objectz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
