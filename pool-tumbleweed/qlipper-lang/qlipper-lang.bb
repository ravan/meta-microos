SUMMARY = "Translations for package qlipper"
DESCRIPTION = "Provides translations for the 'qlipper' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.0"

RPM_NAME = "qlipper-lang-6.0.0-1.5.noarch.rpm"
RPM_HASH = "d624167be22f8a19e5c03428d2b16079b457cbc3a7c00633a95a1a4dfccf22afe3ea41b00dc0f649bf2aeac3df3a2289e0a3bf74cd46f955a89d40c8e7f77734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qlipper-lang \
qlipper-lang-all"

RDEPENDS:${PN} += "qlipper"

inherit rpm
