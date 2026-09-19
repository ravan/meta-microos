SUMMARY = "Iosevka in monospace, JetBrains Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS14 typeface (monospace, JetBrains Mono \
style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss14-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "f4473c878ad4bc3e00a9633130a732ca54901c19d8002ad21c1e4447e344978ce2f74ed920351e4557b1973ee77c9c8ffd9ec831d5f017d9f19382ce658c5f04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss14-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
