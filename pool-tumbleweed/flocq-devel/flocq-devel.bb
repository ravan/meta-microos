SUMMARY = "Development files for Flocq"
DESCRIPTION = "This package contains development files for Flocq."
LICENSE = "LGPL-3.0-or-later"

PV = "4.2.2"

RPM_NAME = "flocq-devel-4.2.2-1.7.aarch64.rpm"
RPM_HASH = "20c230b00e8c55fcd6ff9819d7e82b907798d792995b1c4be6eb3f1227790c7c02856519ca738376c6e6081eaf27da14cd8c6bfa15fc7c34e5b4086ccde47658"

RPROVIDES:${PN} += "flocq-devel"

RDEPENDS:${PN} += "coq-devel \
flocq \
rocq-stdlib-devel"

inherit rpm
