SUMMARY = "Cinnamon Desktop Environment"
DESCRIPTION = "Cinnamon is a modern Linux desktop which provides advanced innovative \
features and a traditional user experience. It's easy to use, \
powerful and flexible."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "202021205"

RPM_NAME = "patterns-cinnamon-cinnamon-202021205-2.16.aarch64.rpm"
RPM_HASH = "47f7b39eb8a1f7a8aa9c9a746c5f5bf47ac64fd4dafe3aea4cb7a66bd5fbb752dff672fc6fd49b293a9f5d7e0e89a6b3088c1cd8dd8723d67d3afd5631efa1f0"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-cinnamon-cinnamon \
patterns-openSUSE-cinnamon"

RDEPENDS:${PN} += "pattern-"

inherit rpm
