SUMMARY = "Plain TeX macros for TUGboat"
DESCRIPTION = "The macros defined in this directory (in files tugboat.sty and \
tugboat.cmn) are used in papers written in Plain TeX for \
publication in TUGboat."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.32svn75521"

RPM_NAME = "texlive-tugboat-plain-2026.226.1.32svn75521-59.2.noarch.rpm"
RPM_HASH = "da08a0ac2fbecc5483c393523681b51272983669d02b41e1564575da8b2a35461b3a89957f00176a6674599039088ece92dcb4b861813f09c3366be941318d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tugboat.sty \
tex-tugproc.sty \
texlive-tugboat-plain"

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
