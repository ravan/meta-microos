SUMMARY = "Helpers Data for exo"
DESCRIPTION = "This package provides the helpers data for exo."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.0"

RPM_NAME = "exo-data-4.20.0-2.8.aarch64.rpm"
RPM_HASH = "8c2374c5f739def0e6ee4a2d2298d9b5ad6936f7355c8fed4927b167976a171de881c7202b2c35c268dff37e0f46802a8bbbd5536802f6a2d63acd8aba633847"

RPROVIDES:${PN} += "exo-data"

RDEPENDS:${PN} += ""

inherit rpm
