SUMMARY = "Insert Bible passages by their reference"
DESCRIPTION = "The package allows to insert Bible texts in a document by \
specifying references."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.2svn45196"

RPM_NAME = "texlive-bibletext-2026.226.0.0.1.2svn45196-61.2.noarch.rpm"
RPM_HASH = "9f675c8bc28c420d03345514a565d2dff57df750968ce94104402acd2b82cb8ce4d7a2dfab1ba5fa5efeb108c6d05fe4bf1cb614a815f5e289037eec8e3d1444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibletext.sty \
texlive-bibletext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdftexcmds.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
