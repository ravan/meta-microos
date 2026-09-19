SUMMARY = "A robust interface to xkeyval"
DESCRIPTION = "The package provides a robust interface to controlling keys in \
xkeyval, removing some of that package's restrictions. The \
package also addresses some of the issues now covered by the \
author's ltxkeys package, which was assumed to be a replacement \
for keyreader. Since keyreader has remained a favourite with \
users, it has been reinstated."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5bsvn28195"

RPM_NAME = "texlive-keyreader-2026.226.0.0.5bsvn28195-63.2.noarch.rpm"
RPM_HASH = "a1e7c37c1b5bb3a50d1a07967a50377bd866e01bd7b9eb4a3111d7d6d7b53f7ef229b5fa05b6c9d76dde42437bc19a112680d4a1460c92e5fb476993620cf4cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyreader.sty \
texlive-keyreader"

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
