SUMMARY = "Kernel firmware files for Eagle IV USB ADSL modem driver"
DESCRIPTION = "This package contains kernel firmware files for Eagle IV USB ADSL modem driver."
LICENSE = "GPL-2.0-or-later & SUSE-Firmware"

PV = "20260703"

RPM_NAME = "kernel-firmware-ueagle-20260703-1.1.noarch.rpm"
RPM_HASH = "0ad4f2d2e596152184b846fae3f81bb81e4544c7f3c946373ce101080affb32ea6fd1b86a4c13b3b5f5ef55006695e0e0af551488cf5ccd8639aba769b59a017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-ueagle-atm/CMV4p.bin.v2 \
firmware-ueagle-atm/DSP4p.bin \
firmware-ueagle-atm/eagleIV.fw \
kernel-firmware-ueagle"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
