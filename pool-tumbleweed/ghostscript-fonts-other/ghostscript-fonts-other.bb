SUMMARY = "Optional Fonts for Ghostscript"
DESCRIPTION = "A miscellaneous set including Cyrillic, \
kana, and fonts derived from the free \
Hershey fonts, with improvements (such as \
adding accented characters) by Thomas Wolff. \
The Hershey-based fonts are quite different \
from traditional printer or display fonts; \
you can read about them in more detail in \
the documentation on Hershey fonts."
LICENSE = "GPL-2.0-only"

PV = "9.06"

RPM_NAME = "ghostscript-fonts-other-9.06-14.4.noarch.rpm"
RPM_HASH = "92e47148a088b91fa3b58f1cb31ce70ef852ef3975d4f7d977682b57eab0f979886bc22deb196e49dc0f18c53310edffa05bd9c9de1ed4febdf614e7f2357cf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostscript-fonts-other"

RDEPENDS:${PN} += "/usr/bin/sh \
ghostscript-fonts-std"

inherit rpm
