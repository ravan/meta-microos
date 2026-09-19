SUMMARY = "GAP: System of nearrings and their applications"
DESCRIPTION = "The SONATA package provides methods for the construction and analysis \
of finite nearrings."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.8"

RPM_NAME = "gap-sonata-2.9.8-1.1.noarch.rpm"
RPM_HASH = "bfe816b8c539113268a956db3a176b685d4eed77b25cc425beb6abddafbd377ea97194af5f0097e254079ced93206f14ba26bfa54143d748a7eb583e802cec2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-sonata"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-smallgrp"

inherit rpm
