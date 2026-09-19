SUMMARY = "Kernel firmware files for Texas Instruments wireless drivers"
DESCRIPTION = "This package contains kernel firmware files for Texas Instruments wireless drivers."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260610"

RPM_NAME = "kernel-firmware-ti-20260610-1.2.noarch.rpm"
RPM_HASH = "edeb8e38953f5ad5d6b2c6ce2d1d014901c98217fc5502bc24b147df8b19fa164ad4f8b95b141dc975a0b8205e5f08e9455d602412cbd16556a0a5fb0eb37522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-ti-connectivity/TIInit-6.2.31.bts \
firmware-ti-connectivity/TIInit-6.6.15.bts \
firmware-ti-connectivity/TIInit-7.2.31.bts \
firmware-ti-connectivity/cc33xx-2nd-loader.bin \
firmware-ti-connectivity/cc33xx-conf.bin \
firmware-ti-connectivity/cc33xx-fw.bin \
firmware-ti-connectivity/wl1251-fw.bin \
firmware-ti-connectivity/wl1251-nvs.bin \
firmware-ti-connectivity/wl1271-fw-2.bin \
firmware-ti-connectivity/wl1271-fw-ap.bin \
firmware-ti-connectivity/wl1271-fw.bin \
firmware-ti-connectivity/wl1271-nvs.bin \
firmware-ti-connectivity/wl127x-fw-3.bin \
firmware-ti-connectivity/wl127x-fw-4-mr.bin \
firmware-ti-connectivity/wl127x-fw-4-plt.bin \
firmware-ti-connectivity/wl127x-fw-4-sr.bin \
firmware-ti-connectivity/wl127x-fw-5-mr.bin \
firmware-ti-connectivity/wl127x-fw-5-plt.bin \
firmware-ti-connectivity/wl127x-fw-5-sr.bin \
firmware-ti-connectivity/wl127x-fw-plt-3.bin \
firmware-ti-connectivity/wl127x-nvs.bin \
firmware-ti-connectivity/wl128x-fw-3.bin \
firmware-ti-connectivity/wl128x-fw-4-mr.bin \
firmware-ti-connectivity/wl128x-fw-4-plt.bin \
firmware-ti-connectivity/wl128x-fw-4-sr.bin \
firmware-ti-connectivity/wl128x-fw-5-mr.bin \
firmware-ti-connectivity/wl128x-fw-5-plt.bin \
firmware-ti-connectivity/wl128x-fw-5-sr.bin \
firmware-ti-connectivity/wl128x-fw-ap.bin \
firmware-ti-connectivity/wl128x-fw-plt-3.bin \
firmware-ti-connectivity/wl128x-fw.bin \
firmware-ti-connectivity/wl128x-nvs.bin \
firmware-ti-connectivity/wl12xx-nvs.bin \
firmware-ti-connectivity/wl18xx-fw-2.bin \
firmware-ti-connectivity/wl18xx-fw-3.bin \
firmware-ti-connectivity/wl18xx-fw-4.bin \
firmware-ti-connectivity/wl18xx-fw.bin \
firmware-ti-keystone/ks2-qmss-pdsp-acc48-k2-le-1-0-0-9.bin \
kernel-firmware-ti"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
