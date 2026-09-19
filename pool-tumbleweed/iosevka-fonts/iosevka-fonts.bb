SUMMARY = "Slender typeface for source code"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka typeface (monospace, default)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "103e7dd32cabf01f1730208a11330c9b71d72ca91c186117a59e0e685a3edcdb29b61f38406631e7038c080a3c67b121d0b6b5ef3d5b5e031478e2b61d040438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
