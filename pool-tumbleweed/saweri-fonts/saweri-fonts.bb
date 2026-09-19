SUMMARY = "Buginese Unicode fonts"
DESCRIPTION = "Font for the lontara script."
LICENSE = "GPL-3.0"

PV = "2.0"

RPM_NAME = "saweri-fonts-2.0-1.25.noarch.rpm"
RPM_HASH = "8424beba285a2b1ab663553ccbd1b5d236f1a540d8962838947c5e7fda28a1ede21319ea4769b1295f01c7d31f38c5327888c826f7c3b3bae1ca15a1adbd3dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saweri-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
