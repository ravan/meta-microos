SUMMARY = "Guile bindings to Cairo"
DESCRIPTION = "Guile bindings to Cairo library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.11.2"

RPM_NAME = "guile-cairo-1.11.2-1.13.aarch64.rpm"
RPM_HASH = "d4922bbafc608d34a24194a3a499b41b1c07a623abee771f60e1353441b89aea791a33f73499ebfbe87aa0322349afa6665f702c1404d73cf021f6b050a09ae5"

RPROVIDES:${PN} += "guile-cairo"

RDEPENDS:${PN} += "/usr/bin/sh \
libguile-cairo0"

inherit rpm
