SUMMARY = "NXP (Freescale) based arm64 systems"
DESCRIPTION = "Device Tree files for NXP (Freescale) based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-freescale-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "e616f14ca3d6774769d6eb88bededb104434a649e63078b8ef645b976a301b5a43b2ef90b306e23f7179c12030785090f201f6b23615b54d5768f824dedcc10a"

RPROVIDES:${PN} += "dtb-freescale \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
