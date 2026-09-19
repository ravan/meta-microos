SUMMARY = "Translations for package qelectrotech"
DESCRIPTION = "Provides translations for the 'qelectrotech' package."
LICENSE = "CC-BY-3.0 & GPL-2.0-or-later"

PV = "0.100"

RPM_NAME = "qelectrotech-lang-0.100-1.3.noarch.rpm"
RPM_HASH = "adb3a4c9d01f5b821388bb7d8805a4b5a917d01b669ddb798d0a5e1c5bd5adee26b2a5a4a30790198bc39d4eaeb7815a678a66057e6a57cb0371cf42eb4ac554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qelectrotech-lang \
qelectrotech-lang-all"

RDEPENDS:${PN} += "qelectrotech"

inherit rpm
