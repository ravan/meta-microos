SUMMARY = "Freetype2 Utilities and Demo Programs"
DESCRIPTION = "Freetype2 utilities and demo programs."
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "ft2demos-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "1daca7d51706891c67f4e1c873f665fa851227825c17454923de44f1aded53bdde37b358528537240404429605665a0f42858ac558e10dbd0a932e9a295775b8"

RPROVIDES:${PN} += "ft2demos"

RDEPENDS:${PN} += "ftbench \
ftdiff \
ftdump \
ftgamma \
ftgrid \
ftinspect \
ftlint \
ftmulti \
ftstring \
ftvalid \
ftview"

inherit rpm
