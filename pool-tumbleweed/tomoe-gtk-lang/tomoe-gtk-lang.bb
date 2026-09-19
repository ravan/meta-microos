SUMMARY = "Translations for package tomoe-gtk"
DESCRIPTION = "Provides translations for the 'tomoe-gtk' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "tomoe-gtk-lang-0.6.0-45.6.noarch.rpm"
RPM_HASH = "49bc882eea4d977498e8161bda3cae2a0638cd626c12e12528bb764c2aeced482d6d370d26e33f8e5aa5c57d7c11041b99d4ac4c2598eb6f0ae268bda7f804c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tomoe-gtk-ja \
tomoe-gtk-lang \
tomoe-gtk-lang-all"

RDEPENDS:${PN} += "tomoe-gtk"

inherit rpm
