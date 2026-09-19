SUMMARY = "OPAL firmware (aka skiboot), used in booting OpenPOWER systems"
DESCRIPTION = "Provides OPAL (OpenPower Abstraction Layer) firmware, aka skiboot, as \
traditionally packaged with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-skiboot-11.1.1-1.1.noarch.rpm"
RPM_HASH = "668993abd23db92e067964f42029e23aecd0d44456b2223ed6b93c0b418a2db77c21bef4c2b061d83510eb35b52c2abd48f1fddda4449db8253567090ce50ab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-skiboot"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
