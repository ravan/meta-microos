SUMMARY = "Iosevka in monospace, IBM Plex Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS15 typeface (monospace, IBM Plex Mono \
style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss15-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "2b386aa33466190c40cff1683bdbded6e01bdd2b992a8d08619236b6e29a7cc20914cda2c2e664154a2d4ec0dc17a730fc90a71bd0ca59474874b5a64ccfb7db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss15-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
