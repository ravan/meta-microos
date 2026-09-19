SUMMARY = "English Dictionaries for ASpell"
DESCRIPTION = "An English, Canadian English and British English dictionary for the ASpell \
spell checker."
LICENSE = "BSD-3-Clause & MIT"

PV = "2026.02.25"

RPM_NAME = "aspell-en-2026.02.25-1.2.aarch64.rpm"
RPM_HASH = "4e309e374e6022874823ab5434a06fbfd9343c08d3fecb3def6b7a04f86ae5b9ac8406ed5dc921046ddb062a1fd0e7210e5ba38be8cc69ec8707eb64e92a4555"

RPROVIDES:${PN} += "aspell-en \
locale-aspell-en"

RDEPENDS:${PN} += ""

inherit rpm
