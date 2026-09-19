SUMMARY = "Tagalog Dictionary for Aspell"
DESCRIPTION = "A Tagalog dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.02"

RPM_NAME = "aspell-tl-0.02-4.7.aarch64.rpm"
RPM_HASH = "3e4c8b157ecf67e19d15f9627173846e83f1143d01aecd7013f95bf88f41c5bc3b241220bdd68d140635067e32b4b2ab09c45a4a79ef91b171845b5d62bb235c"

RPROVIDES:${PN} += "aspell-tl \
locale-aspell-tl"

RDEPENDS:${PN} += ""

inherit rpm
