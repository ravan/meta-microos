SUMMARY = "Kernel firmware files for Marvell Prestera ASIC driver"
DESCRIPTION = "This package contains kernel firmware files for Marvell Prestera ASIC driver."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260610"

RPM_NAME = "kernel-firmware-prestera-20260610-1.2.noarch.rpm"
RPM_HASH = "c1d61dfee3309227a3cb97b13be2c0654a2126931d31807fcf2970012c7933ff9627e99a4188dfc388d0bcfe8b3c36c8f9a43cdea70cf924e3e3c4d9c6861e82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-mrvl/prestera/mvsw-prestera-fw-arm64-v4.1.img \
firmware-mrvl/prestera/mvsw-prestera-fw-v2.0.img \
firmware-mrvl/prestera/mvsw-prestera-fw-v3.0.img \
firmware-mrvl/prestera/mvsw-prestera-fw-v4.0.img \
firmware-mrvl/prestera/mvsw-prestera-fw-v4.1.img \
kernel-firmware-prestera"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
