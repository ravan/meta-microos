SUMMARY = "Place contents into a full width colour strip"
DESCRIPTION = "This lightweight package provides the colorstrip environment, \
that places its contents into a full page width colour strip."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-clrstrip-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "faf895b382f8ed630acc411a733a843340fca80b592c0e17721416354d09d55a010ca858511acc1fc728b50494cec4fced8f1c8b61bbd55f909a06658f897b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clrstrip.sty \
texlive-clrstrip"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expkv.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
