SUMMARY = "Iosevka in monospace, Input Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS18 typeface (monospace, Input Mono style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss18-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "931f5f0af3d361960a83bf8841858ada561b9b978290305c503f4e832eaf4416313543cbf7cfbd120d49cb814e89f8b96de0128d72976d235200aa1a258bc9cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss18-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
