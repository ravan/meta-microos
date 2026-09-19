SUMMARY = "Iosevka in monospace, Ubuntu Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS12 typeface (monospace, Ubuntu Mono style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss12-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "9ad1e89cf40d426a26f2a2e1313c4f436e1e08b456dd24e1b74708bf182e1676326047ee4bf0c5d12da840dfe630a2edb67a3991702b6d6e6ead6e962cbed6ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss12-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
