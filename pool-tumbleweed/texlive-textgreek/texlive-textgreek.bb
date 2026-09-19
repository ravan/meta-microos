SUMMARY = "Upright greek letters in text"
DESCRIPTION = "Use upright greek letters as text symbols, e.g. \\textbeta."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.7svn77682"

RPM_NAME = "texlive-textgreek-2026.227.0.0.7svn77682-62.2.noarch.rpm"
RPM_HASH = "f39579df934db773cc90a2460cadb10047918e7757e943c5e2d34bfa2d715596561881ee31d382c3a132bf0bb92378bdfac2a26680f6f4741addd13fcd652c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textgreek.sty \
texlive-textgreek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-greek-fontenc \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
