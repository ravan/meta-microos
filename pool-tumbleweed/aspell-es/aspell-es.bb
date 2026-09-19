SUMMARY = "Spanish (español) Dictionary for Aspell"
DESCRIPTION = "A Spanish (español) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.11.2"

RPM_NAME = "aspell-es-1.11.2-4.7.aarch64.rpm"
RPM_HASH = "e6e8c9c8554f5dfc4567cd72de771d8264731bd85ff7aec62c9929cb15f18f64801066250a5d0d5f180d011a1ebf969e5abf5721b9764b60a975d3bc5f2f7c7c"

RPROVIDES:${PN} += "aspell-es \
locale-aspell-es"

RDEPENDS:${PN} += ""

inherit rpm
