SUMMARY = "Resize the \\textbullet without changing its vertical center"
DESCRIPTION = "This package enables the user to resize the \\textbullet without \
moving its vertical center. This process is not fully automated \
-- the user must use \\settextbulletfactor to set the \
\\textbullet factor to the correct value to display the resized \
\\textbullet at the correct height."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.5svn77949"

RPM_NAME = "texlive-scaletextbullet-2026.226.2.0.5svn77949-60.2.noarch.rpm"
RPM_HASH = "ccaa03f5cc35e4160f963a4ff97c0be517ed0eb075678e78d50132d53faef769b1313598609f3a4b8160643fd5f969051ee47fa119dee1caf13aba8d2903b116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scaletextbullet.sty \
texlive-scaletextbullet"

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
