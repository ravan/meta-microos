SUMMARY = "Iosevka in monospace, Anonymous Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS02 typeface (monospace, Anonymous Pro \
style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss02-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "7b4907b94a71b67164f8083a3740121d751d64fc2fbba5d68669d2829dcef558bbd3324e97b188006ca910122faf19d56c9108cbe435c02b8c5a2dbd3c5258ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss02-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
