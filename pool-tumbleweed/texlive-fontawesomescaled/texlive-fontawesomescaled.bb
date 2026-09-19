SUMMARY = "Additional macros for fontawesome icons"
DESCRIPTION = "This package provides additional macros for fontawesome icons \
with custom scale or alias creation: \\faIconScaled{} for \
\\faIcon{} \\faScaled{} for \\fa \\CreateAliasFa for alias"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn75980"

RPM_NAME = "texlive-fontawesomescaled-2026.226.0.0.1.1svn75980-60.2.noarch.rpm"
RPM_HASH = "6f73bb73798a5a532fef43702b4a4021d26e742337d495399733dbe14a59e4ba9c56edfef461c61a8e0b3bd212cc50c5bca25a79dafe7f9fd232c5cd6784f6d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontawesomescaled.sty \
texlive-fontawesomescaled"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontawesome.sty \
tex-fontawesome5.sty \
tex-fontawesome6.sty \
tex-fontawesome7.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-relsize.sty \
tex-simplekv.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
