SUMMARY = "Dutch (Nederlands) Dictionary for Aspell"
DESCRIPTION = "A Dutch (Nederlands) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "1.00.7"

RPM_NAME = "aspell-nl-1.00.7-4.7.aarch64.rpm"
RPM_HASH = "c5955783bb5c6ec7ccfcf01b8454efde28d9c80b2515fd471c0aec6f7cfadff321ccbb89f8cec1e880dbe3390d7eed0a9619c95f38430d4c7e85f3ad50e41620"

RPROVIDES:${PN} += "aspell-nl \
locale-aspell-nl"

RDEPENDS:${PN} += ""

inherit rpm
