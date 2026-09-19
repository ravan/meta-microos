SUMMARY = "Translations for package net-tools"
DESCRIPTION = "Provides translations for the 'net-tools' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.14~alpha~git.20260718.4f5bfb2"

RPM_NAME = "net-tools-lang-3.14~alpha~git.20260718.4f5bfb2-1.1.noarch.rpm"
RPM_HASH = "755558cbc6b3b0a4de702453b64afafbf2c66eb0805c856e9a194e4d740c433a1d19fca127afab96f725b0f17c2fbd4f358d4961716936270d919eed12d6cfdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-net-tools-ca \
locale-net-tools-cs \
locale-net-tools-de \
locale-net-tools-et \
locale-net-tools-fr \
locale-net-tools-ja \
locale-net-tools-ka \
locale-net-tools-pt-BR \
locale-net-tools-sv \
net-tools-lang \
net-tools-lang-all"

RDEPENDS:${PN} += "net-tools"

inherit rpm
