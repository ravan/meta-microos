SUMMARY = "Catalan (català) Dictionary for Aspell"
DESCRIPTION = "A Catalan (català) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.60.1.20090722"

RPM_NAME = "aspell-ca-0.60.1.20090722-4.7.aarch64.rpm"
RPM_HASH = "3e16b6a5e0a78598cd69432c93237648cc49bbd58755da261cd40fce9cc37b82406ecbaec8bec92a020b708137f60819cf9fd9ae3af59a37e6a2e7da90520b8b"

RPROVIDES:${PN} += "aspell-ca \
locale-aspell-ca"

RDEPENDS:${PN} += ""

inherit rpm
