SUMMARY = "Provide 'turn page' instructions"
DESCRIPTION = "The package prints a 'turn' instruction at the bottom of \
odd-numbered pages (except the last). This is a common \
convention for examination papers and the like."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0asvn77682"

RPM_NAME = "texlive-turnthepage-2026.226.2.0asvn77682-59.2.noarch.rpm"
RPM_HASH = "4cc809fe51c48cbc73086698a1f704f702c527513f37998389e94714ea7765585ff49e3cd0d2b7e41a805d747bab134b4ae108e5650837e9bc41ad646f214b07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turnpageetex.sty \
tex-turnpagewoetex.sty \
tex-turnthepage.sty \
texlive-turnthepage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-atveryend.sty \
tex-everyshi.sty \
tex-picture.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
