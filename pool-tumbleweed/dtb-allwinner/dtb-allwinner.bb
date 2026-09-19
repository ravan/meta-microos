SUMMARY = "Allwinner based arm64 systems"
DESCRIPTION = "Device Tree files for Allwinner based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-allwinner-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "0792beccd17eaad39e787001619416d1d0c29acadef47eaf79081be518c87a473e38c74fde2489ab84a1079971ba377fda01c9a266dc64877884da2d4e1a787c"

RPROVIDES:${PN} += "dtb-allwinner \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
