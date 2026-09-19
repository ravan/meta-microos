SUMMARY = "Icelandic (Íslenska) Dictionary for Aspell"
DESCRIPTION = "An Icelandic (Íslenska) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.51.10"

RPM_NAME = "aspell-is-0.51.10-4.7.aarch64.rpm"
RPM_HASH = "6b008aec48837bdb807aad7c6977a4f7a927bc48a06187a289afc43633b14aac259b42fb0c56a08d73eb0899dc2bdd297c86c8cb765c11e577aafd6f78bd5885"

RPROVIDES:${PN} += "aspell-is \
locale-aspell-is"

RDEPENDS:${PN} += ""

inherit rpm
