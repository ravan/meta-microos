SUMMARY = "Iosevka in monospace, Fira Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS05 typeface (monospace, Fira Mono style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss05-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "caf581084cb2002c3f82a7ffb2ce2d893dc0e9ebb305962cccba67abae2b9aaea4ac09a665471bab6947d5fbc0106c33f2c07fcd2813bb469974d5431b4e2e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss05-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
