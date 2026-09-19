SUMMARY = "Maori (Māori) Dictionary for Aspell"
DESCRIPTION = "A Maori (Māori) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.50"

RPM_NAME = "aspell-mi-0.50-4.7.aarch64.rpm"
RPM_HASH = "682b62667e5cfa52efc061c46d6f7f0b6907e68e67045a3c370096146f09f6b49bc34b0cbee353200c8150446d844517540722ab929963440b1d1c3b13322bf4"

RPROVIDES:${PN} += "aspell-mi \
locale-aspell-mi"

RDEPENDS:${PN} += ""

inherit rpm
