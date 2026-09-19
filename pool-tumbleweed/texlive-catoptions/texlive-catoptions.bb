SUMMARY = "Preserving and recalling standard catcodes"
DESCRIPTION = "The package changes package loading internals so that all \
subsequently loaded packages can rely on normal/standard \
catcodes of all ASCII characters. The package defines canonical \
control sequences to represent all the visible ASCII \
characters. It also provides robust option parsing mechanisms \
(XDeclareOption, XExecuteOptions and XProcessOptions, which \
will be used by \\documentclass if the package has already been \
loaded). The package also provides a range of other TeX \
programming tools."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.7isvn68982"

RPM_NAME = "texlive-catoptions-2026.226.0.0.2.7isvn68982-59.2.noarch.rpm"
RPM_HASH = "3f0f2ab9edbc6e7b41c34189b624ae8fe6803dd1415a5736f6469844742b63bbb94db2e14fde5ef6085743b80ceb7d238cff20d14416128463763e862f7965e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-catoptions-guide.cfg \
tex-catoptions.sty \
texlive-catoptions"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
