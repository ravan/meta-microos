SUMMARY = "Translations for package kf6-kded"
DESCRIPTION = "Provides translations for the 'kf6-kded' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kded-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "9b4ab0de5f1370c70a3fc5ad9d8eaa9f0ae670ee1ac740979e802196bfa2564ce16b013c1b0cc20640c39a8f33d0e51ff15a10b34c9d4bcda33b98d4eaf49f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-kded-lang \
kf6-kded-lang-all"

RDEPENDS:${PN} += "kf6-kded"

inherit rpm
