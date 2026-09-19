SUMMARY = "Avoid widows"
DESCRIPTION = "This package provides a useful macro to manage widow lines."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-nowidow-2026.226.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "3cf278cea4944f617314e4f77dcf4ee3f04884927eacb4df60b5e419a062795babdc2afda718cfdf2a224ee537a4842ae84b794343b91e5696983636e5a08b51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nowidow.sty \
texlive-nowidow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
