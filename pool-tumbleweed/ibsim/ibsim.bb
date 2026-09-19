SUMMARY = "InfiniBand fabric simulator for management"
DESCRIPTION = "ibsim provides simulation of infiniband fabric for using with OFA \
OpenSM, diagnostic and management tools."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "0.12"

RPM_NAME = "ibsim-0.12-3.7.aarch64.rpm"
RPM_HASH = "cddab58b2fc0c6660cbcd95726982dd034d8af2a25f053c849077774a6b6c01595cc64029f56e10cff8ea220bbe463cdea17d7e78826a18ceebb76e126c575d8"

RPROVIDES:${PN} += "ibsim \
libumad2sim.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibmad.so.5 \
libibumad.so.3"

inherit rpm
