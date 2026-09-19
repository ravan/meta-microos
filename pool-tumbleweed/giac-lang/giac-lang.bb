SUMMARY = "Translations for package giac"
DESCRIPTION = "Provides translations for the 'giac' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "giac-lang-2.0.0-2.6.noarch.rpm"
RPM_HASH = "6f7be74add6cda683e2f4c1bb38055d14ccf087cab4e41893c9f9a0a9025173d089bac3768317cfa3872d4881d9170c5c318e918c0f1597817e064ddcd2c9db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "giac-lang \
giac-lang-all \
locale-giac-de \
locale-giac-el \
locale-giac-en \
locale-giac-es \
locale-giac-fr \
locale-giac-it \
locale-giac-pt \
locale-giac-zh"

RDEPENDS:${PN} += "giac"

inherit rpm
