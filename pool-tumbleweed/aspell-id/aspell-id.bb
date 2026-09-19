SUMMARY = "Indonesian (Bahasa Indonesia) Dictionary for Aspell"
DESCRIPTION = "An Indonesian (Bahasa Indonesia) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "aspell-id-1.2-4.7.aarch64.rpm"
RPM_HASH = "870b7b53d93bff9a8ca2e6c33be9844704eaf5df3baafbf3bf8ee71460ed2863cb841a365f0a04ec657585c7b8a9f51f41ad8f121bbe76276b75f038a25da4b6"

RPROVIDES:${PN} += "aspell-id \
locale-aspell-id"

RDEPENDS:${PN} += ""

inherit rpm
