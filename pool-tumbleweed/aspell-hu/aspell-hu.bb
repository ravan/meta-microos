SUMMARY = "Hungarian (magyar) Dictionary for Aspell"
DESCRIPTION = "A Hungarian (magyar) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.99.4.2"

RPM_NAME = "aspell-hu-0.99.4.2-4.7.aarch64.rpm"
RPM_HASH = "7943455a5086a9d297f6a8391697587b2fcb76a2304b4b0f342d1b1254c2a3b542a2edb0bf2686121b97b59f34e836191f5ae39cae4e6fa14ddad56791cb3c9d"

RPROVIDES:${PN} += "aspell-hu \
locale-aspell-hu"

RDEPENDS:${PN} += ""

inherit rpm
