SUMMARY = "Additional Documentation about Mutt"
DESCRIPTION = "Some extend documentation about mutt together with muttrc examples \
for different environments and requirements."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.2"

RPM_NAME = "mutt-doc-2.4.2-1.1.noarch.rpm"
RPM_HASH = "81d0514d0b39ce56d0a7f1a9a6b4451ef5e6b01f6f37c516a46c5a58bcf88817a0842e67dc81e693f0e18b5c94295b22007bd34f34c27ebe05c509d77dfa5b23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mutt-/usr/share/doc/packages/mutt/COPYRIGHT \
mutt-doc"

RDEPENDS:${PN} += "/usr/bin/sh \
mutt"

inherit rpm
