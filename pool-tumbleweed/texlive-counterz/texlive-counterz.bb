SUMMARY = "Additional tools for counters"
DESCRIPTION = "The package facilitates the use of stealth prefixes for counter \
names in order to help distinguish between counters from \
multiple input files. The package also provides a means to \
generate random counters and save such counter values for \
future typesetting."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn67335"

RPM_NAME = "texlive-counterz-2026.226.1.1.1svn67335-61.2.noarch.rpm"
RPM_HASH = "4acbce69dddb6f131c59e859be275ac387bf6d61b32808ccf7e632fea079925b7b8515aeed416cd07315838cd9354acbb4a857ed004b04065bc46469b809207e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-counterz.sty \
texlive-counterz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-makecmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
