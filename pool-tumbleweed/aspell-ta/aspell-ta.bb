SUMMARY = "Tamil (தமிழ்) Dictionary for Aspell"
DESCRIPTION = "A Tamil (தமிழ்) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "20040424"

RPM_NAME = "aspell-ta-20040424-4.7.aarch64.rpm"
RPM_HASH = "a1a0cbc5c57cbc7d0076e181c4c29b10689629d564ad748fec5a4585efb04d8e623de10f2ca67dc636ee26837921e37c51fbf5327e798e4ff1ec819b8575795a"

RPROVIDES:${PN} += "aspell-ta \
locale-aspell-ta"

RDEPENDS:${PN} += ""

inherit rpm
