SUMMARY = "Scottish (Gàidhlig) Gaelic Dictionary for Aspell"
DESCRIPTION = "A Scottish (Gàidhlig) Gaelic dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1.1.1"

RPM_NAME = "aspell-gd-0.7.1.1.1-4.7.aarch64.rpm"
RPM_HASH = "b8b6aa8ba911a5bdf05a8a20f60d1b2113e921883fdbc7790dfed9cf9f6b7bee22b202a0ae0bf9a656fd71aad3037ce0e3ee029bf7b360518b7c3435244142a2"

RPROVIDES:${PN} += "aspell-gd \
locale-aspell-gd"

RDEPENDS:${PN} += ""

inherit rpm
