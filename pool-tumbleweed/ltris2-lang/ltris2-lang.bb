SUMMARY = "Translations for package ltris2"
DESCRIPTION = "Provides translations for the 'ltris2' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4"

RPM_NAME = "ltris2-lang-2.0.4-2.3.noarch.rpm"
RPM_HASH = "ea9af397b0a00006e8db22add0b984e261897682261f1f5b79ec81bea7e43d6f542813a17fa48004a033ac2ff56d17ef721c8548f4364a7f3a3b317db22168fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-ltris2-de \
ltris2-lang \
ltris2-lang-all"

RDEPENDS:${PN} += "ltris2"

inherit rpm
