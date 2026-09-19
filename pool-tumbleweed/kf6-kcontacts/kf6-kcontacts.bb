SUMMARY = "KDE Frameworks based address book API"
DESCRIPTION = "kcontacts is a Qt library which provides an API \
to access address book data stored in different formats."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcontacts-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "16e4b66b5aa7a647ac50d32e67979c9f669fa89addb2f76a63a697b7718b957cea2bdd111788d6d5132bcb25e69be3bacb5ae67cad11819744097960a5e3ea49"

RPROVIDES:${PN} += "kf6-kcontacts"

RDEPENDS:${PN} += ""

inherit rpm
