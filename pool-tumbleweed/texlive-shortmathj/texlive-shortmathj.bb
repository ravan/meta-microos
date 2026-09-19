SUMMARY = "Automatically shortify titles of mathematical journals"
DESCRIPTION = "This small dummy package just contains a simple list of full \
and short journal names as written in AMS standard: \
https://mathscinet.ams.org/msnhtml/serials.pdf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.0svn76790"

RPM_NAME = "texlive-shortmathj-2026.226.0.0.5.0svn76790-60.2.noarch.rpm"
RPM_HASH = "4e2b5faad19cfc9ff2164c299f1291b776e05184834c986b8750682acfdc9acaf9263d46dc1ab79958ada7ae87c85e5bc69f4d998d11bb7dc08320410bb716a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shortmathj.sty \
texlive-shortmathj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
