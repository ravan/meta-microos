SUMMARY = "Font with Basic Maya Glyphs"
DESCRIPTION = "Maya covers the glyphs in J. Eric S. Thompson’s “A Catalog of Maya \
Hieroglyphs”, as well as some extra glyphs for days, months and numbers. \
This is a work-font that may be of some scholarly use; it is not a proposal \
of any kind. There are no plans to improve or expand it."
LICENSE = "SUSE-Permissive"

PV = "4.17"

RPM_NAME = "gdouros-maya-fonts-4.17-1.24.noarch.rpm"
RPM_HASH = "393d67664b07121b36e4babf71da67620bfdd7f5e71c2ee0b508166a3465c8609c7043712c09c0f8f908fd8a31527ce27f39799dfbaa2c54ad28df93a3ed87d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdouros-maya-fonts \
maya-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
