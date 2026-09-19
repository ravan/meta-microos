SUMMARY = "Translations for package lxqt-globalkeys"
DESCRIPTION = "Provides translations for the 'lxqt-globalkeys' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-globalkeys-lang-2.4.0-1.2.noarch.rpm"
RPM_HASH = "0287df9c5c88c2430a6ad366cf2c304a187f92d8c37d3272040493dedc277f2330d905fdcdcb8d4087126d21166bb1655d2560b3d6cf5c39b2c6ad2ea416f812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-globalkeys-lang \
lxqt-globalkeys-lang-all"

RDEPENDS:${PN} += "lxqt-globalkeys"

inherit rpm
