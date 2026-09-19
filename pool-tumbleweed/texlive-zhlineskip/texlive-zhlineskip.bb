SUMMARY = "Line spacing for CJK documents"
DESCRIPTION = "This package supports typesetting CJK documents. It allows \
users to specify the two ratios between the leading and the \
font size of the body text and the footnote text. For CJK \
typesetting, these ratios usually range from 1.5 to 1.67. This \
package is also capable of restoring the math leading to that \
of the Latin text (usually 1.2 times the font size). Finally, \
it is possible to achieve the Microsoft Word multiple line \
spacing style using zhlineskip."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0esvn51142"

RPM_NAME = "texlive-zhlineskip-2026.226.1.0esvn51142-59.4.noarch.rpm"
RPM_HASH = "0493d8344f6be658529ccefbd367bed0f9a326bfe652d47b701b401478f555efe67f8e55bf5a62d327dce1fedce3d5cbc95764f80fa0d0c6d2c114e99b3016bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zhlineskip.sty \
texlive-zhlineskip"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-mathtools.sty \
tex-xintexpr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
