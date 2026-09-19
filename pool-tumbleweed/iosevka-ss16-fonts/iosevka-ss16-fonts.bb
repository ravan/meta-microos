SUMMARY = "Iosevka in monospace, PT Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS16 typeface (monospace, PT Mono style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss16-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "82a65ec397e6ad811fba38055e5569bacbd1753761636616f3daa56bda625d1285534835e145ad9a1c08e05cc5107225f4fb2f3813f5f3de677b8c92a763414c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss16-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
