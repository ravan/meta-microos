SUMMARY = "Iosevka in monospace, Source Code Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS09 typeface (monospace, Source Code Pro \
style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss09-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "6493d32dc3befee1aadbc84b126c4ded1df317c43f0224b04a9452b7d3ff8d798dd1335dfcbd19a411c8269c80e30ab30e85d92bae336dc93cf0b2b1026d9b3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss09-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
