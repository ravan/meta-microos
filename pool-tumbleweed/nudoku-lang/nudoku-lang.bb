SUMMARY = "Translations for package nudoku"
DESCRIPTION = "Provides translations for the 'nudoku' package."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "nudoku-lang-8.0.1-1.2.noarch.rpm"
RPM_HASH = "e67f8b0544d5be12dbf38b5edccfd95e2d2cf5d8d30fc86a58747f6c6d01c374fcedc3e65b6be1e69114f4326fe1f1cb9b911d0ed5645ea45a311c35eef606d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nudoku-de \
locale-nudoku-es \
locale-nudoku-fr \
locale-nudoku-ja \
locale-nudoku-ka \
locale-nudoku-ru \
locale-nudoku-tr \
locale-nudoku-uk \
locale-nudoku-vi \
nudoku-lang \
nudoku-lang-all"

RDEPENDS:${PN} += "nudoku"

inherit rpm
