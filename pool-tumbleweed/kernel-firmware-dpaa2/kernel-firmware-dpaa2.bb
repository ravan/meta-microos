SUMMARY = "Kernel firmware files for NXP Management Complex bus driver"
DESCRIPTION = "This package contains kernel firmware files for NXP Management Complex bus driver."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260610"

RPM_NAME = "kernel-firmware-dpaa2-20260610-1.2.noarch.rpm"
RPM_HASH = "d3d596295d6c466d2349e4fa63561f9e7551fa2d9a306950342f52b7dae53615dd7aac6dbeb6bf2ec65fd62930f6e7b253402cc3bb1359327c2435d59aa7bd76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-dpaa2/mc/mc-10.10.0-ls1088a.itb \
firmware-dpaa2/mc/mc-10.10.0-ls2088a.itb \
firmware-dpaa2/mc/mc-10.10.0-lx2160a.itb \
firmware-dpaa2/mc/mc-10.14.3-ls1088a.itb \
firmware-dpaa2/mc/mc-10.14.3-ls2088a.itb \
firmware-dpaa2/mc/mc-10.14.3-lx2160a.itb \
firmware-dpaa2/mc/mc-10.16.2-ls1088a.itb \
firmware-dpaa2/mc/mc-10.16.2-ls2088a.itb \
firmware-dpaa2/mc/mc-10.16.2-lx2160a.itb \
firmware-dpaa2/mc/mc-10.18.0-ls1088a.itb \
firmware-dpaa2/mc/mc-10.18.0-ls2088a.itb \
firmware-dpaa2/mc/mc-10.18.0-lx2160a.itb \
firmware-dpaa2/mc/mc-10.28.1-ls1088a.itb \
firmware-dpaa2/mc/mc-10.28.1-ls2088a.itb \
firmware-dpaa2/mc/mc-10.28.1-lx2160a.itb \
kernel-firmware-dpaa2"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
