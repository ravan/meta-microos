SUMMARY = "Generate fieldstack based animation with ConTeXt"
DESCRIPTION = "The package is a port, to Context (mkvi), of the corresponding \
LaTeX package."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn75386"

RPM_NAME = "texlive-context-animation-2026.226.svn75386-61.2.noarch.rpm"
RPM_HASH = "2576f906f34c5cb7401341d74856ad2b6035c10e59263507a23a7493833dfc3ed434985e5211e6ef8fb1bc87efa78340e8c4511d7a57aa135d4d7bcb9013220a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-animation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
