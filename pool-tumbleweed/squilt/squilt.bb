SUMMARY = "A quilt wrapper using bubblewrap"
DESCRIPTION = "Wrapper to confine quilt with bubblewrap"
LICENSE = "MIT"

PV = "20251029.56b4c47"

RPM_NAME = "squilt-20251029.56b4c47-2.3.noarch.rpm"
RPM_HASH = "f7bd79a44f2f6fa240d234289144e05c6364cf606252cc58c9b22447cd2f147f778ba7efc3609c5f0b782004914d3a868180026fad7e877890e500823776f4da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "squilt"

RDEPENDS:${PN} += "/usr/bin/sh \
bubblewrap \
quilt"

inherit rpm
