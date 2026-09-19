SUMMARY = "Roman page numbers negative"
DESCRIPTION = "Causes the page numbers in the DVI file (as defined by \\count0) \
to be negative when roman pagenumbering is in effect."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn20087"

RPM_NAME = "texlive-romanneg-2026.226.svn20087-60.2.noarch.rpm"
RPM_HASH = "fc31ebd735f8e2d46be5a81faf9570ae12677d27620f34964b3c17e98d5ddf2d53ffd2610f2945fafa7aab0009167c375074c6647932bae370a648ce3b74baec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-romanneg.sty \
texlive-romanneg"

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
