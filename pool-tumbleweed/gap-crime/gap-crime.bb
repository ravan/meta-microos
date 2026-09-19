SUMMARY = "GAP: Calculation of group cohomology and Massey products"
DESCRIPTION = "This GAP package computes cohomology rings for finite p-groups using \
Jon Carlson's method, both as GAP objects, and also in terms of \
generators and relators. It also computes induced homomorphisms on \
cohomology and Massey products in the cohomology ring."
LICENSE = "GPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "gap-crime-1.6-1.9.noarch.rpm"
RPM_HASH = "cf22960993fe3b2f464fc888b7c18c26dd10383f4eca943bc05cb03721cfe38fb53ce45002e87b30bcd4e33108a37065cf8ddab9c729ff3dd138f67a191453c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-crime"

RDEPENDS:${PN} += "/usr/bin/perl \
gap-core"

inherit rpm
