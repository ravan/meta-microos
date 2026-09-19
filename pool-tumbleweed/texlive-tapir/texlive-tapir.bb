SUMMARY = "A simple geometrical font"
DESCRIPTION = "Tapir is a simple geometrical font mostly created of line and \
circular segments with constant thickness. The font is \
available as Metafont source and in Adobe Type 1 format. The \
character set contains all characters in the range 0-127 (as in \
cmr10), accented characters used in the Czech, Slovak and \
Polish languages."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.0.0.2svn20484"

RPM_NAME = "texlive-tapir-2026.227.0.0.2svn20484-62.2.noarch.rpm"
RPM_HASH = "d7e1a64f23f2ad1cb081219a51573cc9c3e60f532630173edc34445e68bf3e218a0eb97605f2fa6ced3a463654f823ccff52b343856de6407af933d68e21b3be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tapir"

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
texlive-scripts-bin \
texlive-tapir-fonts"

inherit rpm
