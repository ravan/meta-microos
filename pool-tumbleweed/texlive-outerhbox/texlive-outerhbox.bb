SUMMARY = "Collect horizontal material for contributing to a paragraph"
DESCRIPTION = "The package provides the \\outerhbox command, which is similar \
to \\hbox, except that material is set in outer horizontal mode. \
This prevents TeX from optimising away maths penalties and the \
like, that are needed when the material is \\unhbox'ed."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2svn54254"

RPM_NAME = "texlive-outerhbox-2026.226.1.2svn54254-61.2.noarch.rpm"
RPM_HASH = "6ac97e6e0ed592b5c6a4f3c3122e8d991b3162dc5250cb4681a76af66bcc2b1cc9b7f69db80c15efe48731bd845707ec60c2866860b4f71f7d26dd2449e20ed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-outerhbox.sty \
texlive-outerhbox"

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
