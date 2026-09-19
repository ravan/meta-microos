SUMMARY = "Iosevka in quasi-proportional slab-serif style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Etoile typeface (quasi-proportional, \
slab-serif)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-etoile-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "5e94417637a2441943b241d50cd3d0529e667209bf56ea63391452546bd27fb8931fc8390abb2b8b0ecaed7e76a29beb64aacd7fbe9423509ec5fdf63e740275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-etoile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
