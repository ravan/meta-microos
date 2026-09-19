SUMMARY = "Macros for maintaining colour stacks under pdfTeX"
DESCRIPTION = "Since version 1.40 pdfTeX supports colour stacks. The driver \
file pdftex.def for package color defines and uses a main \
colour stack since version v0.04b. This package is intended for \
package writers. It defines macros for setting and maintaining \
new colour stacks."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn64469"

RPM_NAME = "texlive-pdfcol-2026.226.1.7svn64469-58.2.noarch.rpm"
RPM_HASH = "e287f2d76a64bf8ac0a553a1b2c12ff5943d8737e317601b95f042640cd751ef501cb4ba69113b0546c52007e6972e99b3d83e0ed42405afdb73ed465778dd6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfcol.sty \
texlive-pdfcol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
