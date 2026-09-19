SUMMARY = "Iosevka in quasi-proportional sans-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Aile typeface (quasi-proportional, \
sans-serif)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-aile-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "1eac6a5703c3243769266e51d0fdd002c06d4890d90625f74e91d18be0a7418ad649497e8df17e3c24877f5b8887f781b31fa05b52b0b18ca9bfbd96347c4695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-aile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
