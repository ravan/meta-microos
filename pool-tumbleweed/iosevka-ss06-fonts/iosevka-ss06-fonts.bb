SUMMARY = "Iosevka in monospace, Liberation Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS06 typeface (monospace, Liberation Mono \
style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss06-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "e2478a79a4397ceea061d4423be973bc398d41d1ee6c38bc9bdc3962dfeeca946c61a595b3d0b93982d381112fc6453530853c7fc316f52268bdcfd035f64326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss06-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
