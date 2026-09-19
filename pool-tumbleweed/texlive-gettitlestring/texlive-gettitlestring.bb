SUMMARY = "Clean up title references"
DESCRIPTION = "Cleans up the title string (removing \\label commands) for \
packages (such as nameref) that typeset such strings."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-gettitlestring-2026.226.1.6svn77682-60.2.noarch.rpm"
RPM_HASH = "91363cb5ca401f0bc160750ad8ad90c2f23f7c5d58bd96ad228fdadf3bc37031919a1279c80e65e2c37e10f5af61c52891e9608c721c149bb479b169c3c212d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gettitlestring.sty \
texlive-gettitlestring"

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
