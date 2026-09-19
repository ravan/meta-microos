SUMMARY = "Easily add boldface, italics and smallcaps"
DESCRIPTION = "This package allows the use of underscores and circumflexes to \
begin resp. end italic, bold or SMALLCAPS formatting, as an \
alternative to the standard LaTeX \\textit{...}, \\textbf{...} \
and/or \\textsc{...}. The meaning of underscore and circumflex \
in mathmode remain the same."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.4.0svn44543"

RPM_NAME = "texlive-easyformat-2026.226.1.4.0svn44543-61.4.noarch.rpm"
RPM_HASH = "ac677161d8857dd5e4f9ffb2456a3ddd9a3f2e00484f89ffe3557a095c518260dde61dc8c733c5038133716d99bcb92b8c4f8102ec66d303fd7d9b3c10f29928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easyformat.sty \
texlive-easyformat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
