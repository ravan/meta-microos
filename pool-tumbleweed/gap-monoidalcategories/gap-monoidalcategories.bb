SUMMARY = "GAP: Monoidal and monoidal (co-)closed categories"
DESCRIPTION = "Monoidal and monoidal (co-)closed categories for GAP."
LICENSE = "GPL-2.0-or-later"

PV = "2026.05.02"

RPM_NAME = "gap-monoidalcategories-2026.05.02-1.2.aarch64.rpm"
RPM_HASH = "ebe287316816351649b01d689ade6a9b042b751753a60e4bb110f32ac1c8cdc0c3ab697d725d77cc8d6eba4971338dc9437941633755cac9417d3115801c0bcc"

RPROVIDES:${PN} += "gap-monoidalcategories"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-cap \
gap-core \
gap-toolsforhomalg"

inherit rpm
