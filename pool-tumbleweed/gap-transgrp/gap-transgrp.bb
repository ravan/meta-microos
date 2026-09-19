SUMMARY = "GAP: Transitive Groups Library"
DESCRIPTION = "The TransGrp package provides the library of transitive groups."
LICENSE = "Artistic-2.0 & GPL-2.0-only & GPL-3.0-only"

PV = "3.6.5"

RPM_NAME = "gap-transgrp-3.6.5-1.9.noarch.rpm"
RPM_HASH = "d9f10a12bee9892535c0c4ccb31172add10d199ddbc383ef55f104171d16023302a45111f44bba9b39d1d342ae24a52f8d91f7e8a04c4bb3b46b2a45b2c530a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-transgrp"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core"

inherit rpm
