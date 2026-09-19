SUMMARY = "GAP: Algebraic Combinatorics"
DESCRIPTION = "The ALCO package provides tools for algebraic combinatorics including \
implementations of octonion and Jordan algebras."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "gap-alco-1.1.2-1.3.noarch.rpm"
RPM_HASH = "2e7ae422e0444025c5baa072508ce48fd131fb25c71ba7a978e71d8fe0cd189291098189b77e9706de9b487da392d530a6dc1a74fb52888c5ebbff2b81550ac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-alco"

RDEPENDS:${PN} += "gap-core \
gap-resclasses"

inherit rpm
