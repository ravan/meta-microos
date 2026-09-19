SUMMARY = "Translations for package highlight-gui"
DESCRIPTION = "Provides translations for the 'highlight-gui' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.18"

RPM_NAME = "highlight-gui-lang-4.18-1.6.noarch.rpm"
RPM_HASH = "f2e9a3980e31f00b1596ead1b17b3a552af7c2e586292633666d5e80be73e882b2475bbd588daf6c5490fbb4a83c2ce1916fde915b359aa819ea55c22d6177b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-gui-lang \
highlight-gui-lang-all"

RDEPENDS:${PN} += "highlight-gui"

inherit rpm
