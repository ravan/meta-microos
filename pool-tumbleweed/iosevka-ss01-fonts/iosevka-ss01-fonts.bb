SUMMARY = "Iosevka in monospace, Andale Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS01 typeface (monospace, Andale Mono style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss01-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "11c81c0ab8ed5ecafe2321a4b2e0bd91fc08a8f0f0915008243e8620f78f8583653c5ff77283893c9209a72065cbd66ea0d0dcebc269fd7b0835d62ba5715092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss01-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
