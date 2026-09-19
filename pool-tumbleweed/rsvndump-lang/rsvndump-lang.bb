SUMMARY = "Translations for package rsvndump"
DESCRIPTION = "Provides translations for the 'rsvndump' package."
LICENSE = "GPL-3.0-only"

PV = "0.6.2"

RPM_NAME = "rsvndump-lang-0.6.2-1.10.noarch.rpm"
RPM_HASH = "c3a515b35dc56a512a2ed6f5830bc91335e18001d22c8c25dc1cc916a552ee8e816062d5d7570798251eec149f1a87aaa73999ae51c4011cbcc45b07cf712140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rsvndump-de \
rsvndump-lang \
rsvndump-lang-all"

RDEPENDS:${PN} += "rsvndump"

inherit rpm
