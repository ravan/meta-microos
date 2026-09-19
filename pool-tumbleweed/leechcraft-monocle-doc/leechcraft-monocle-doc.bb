SUMMARY = "LeechCraft Monocle Documentation"
DESCRIPTION = "This packages provides documentation of LeechCraft Monocle API. \
 \
It contains description of Monocle API used for developing LeechCraft \
Monocle sub-plugins. For developing first-lexel plugins, please refer \
to corresponding packages (like leechcraft-doc). This documentation \
is also available online at http://doc.leechcraft.org/monocle/"
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-monocle-doc-0.6.70+git.18808.g3467692359-3.1.noarch.rpm"
RPM_HASH = "aa5e763b8d3f4186c9effbfa894b8dadb2e347ac2e7f0868e903e4421ad46dcac1ba5b4691fccb4d1bed727c90c019ff6ce77d4c3057e980e65272d96e2cf74a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-monocle-doc"

RDEPENDS:${PN} += ""

inherit rpm
