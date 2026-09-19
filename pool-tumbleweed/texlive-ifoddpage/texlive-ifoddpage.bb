SUMMARY = "Determine if the current page is odd or even"
DESCRIPTION = "The package provides an \\ifoddpage conditional to determine if \
the current page is odd or even. The macro \\checkoddpage must \
be used direct before to check the page number using a label. \
Two compiler runs are therefore required to achieve correct \
results. In addition, the conditional \\ifoddpageoronside is \
provided which is also true in oneside mode where all pages use \
the odd page layout."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-ifoddpage-2026.226.1.2svn77682-60.2.noarch.rpm"
RPM_HASH = "276eccdf426a759ef14c8703184030d46ecdd933fbd8149b4edfb1cb836972d40194a78442b6f9fe29ff5b1dd3240e2b6434942d4cd8b9c01b170f7b9f34d248"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifoddpage.sty \
texlive-ifoddpage"

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
