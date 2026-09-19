SUMMARY = "Translations for package lxqt-powermanagement"
DESCRIPTION = "Provides translations for the 'lxqt-powermanagement' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-powermanagement-lang-2.4.0-1.2.noarch.rpm"
RPM_HASH = "ad3196eb92e8882976dc34c22b1f414fec76c8af22507637b24f0e7c8e178c342d8260cda7d656f0fac7befa9e642a78aa5e60bcb02cd3e76ee1e1e0b167a195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-powermanagement-lang \
lxqt-powermanagement-lang-all"

RDEPENDS:${PN} += "lxqt-powermanagement"

inherit rpm
