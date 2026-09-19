SUMMARY = "Translations for package lxqt-about"
DESCRIPTION = "Provides translations for the 'lxqt-about' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-about-lang-2.4.0-1.2.noarch.rpm"
RPM_HASH = "660e430a7faa7c09a83db6e20156a1dad0c45869365237fb42b68df8945321c8e3cb20ec2c4afda88d7018bfaf620cf521549987d927e1378a685fa81ec99d14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-about-lang \
lxqt-about-lang-all"

RDEPENDS:${PN} += "lxqt-about"

inherit rpm
