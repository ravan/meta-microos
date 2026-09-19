SUMMARY = "Configuration for the Raspberry Pi firmware loader"
DESCRIPTION = "This package configures the Raspberry Pi boot process. \
2 flavors are available: \
  * raspberrypi-firmware-config - the default config \
  * raspberrypi-firmware-config-camera - the config which enables \
  start_x=1 and increase gpu_mem to be able to use a camera module \
 \
Note: config.txt should not be used to set manually params (gpu_mem, etc.) \
please create extraconfig.txt instead."
LICENSE = "MIT"

PV = "2026.02.11"

RPM_NAME = "raspberrypi-firmware-config-2026.02.11-3.1.noarch.rpm"
RPM_HASH = "7687cbd92ac667714a21173f9282d23e2ab2ecc88699486fd3a2275d36cf73a4d24635c68e4c7940898185082e5bbe26a5ceaf77163d5e164d3b48c5d7909776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-raspberrypi-firmware-config \
raspberrypi-firmware-branding-openSUSE \
raspberrypi-firmware-config \
raspberrypi-firmware-config-rpi \
raspberrypi-firmware-config-rpi0w \
raspberrypi-firmware-config-rpi2 \
raspberrypi-firmware-config-rpi3"

RDEPENDS:${PN} += "/usr/bin/sh \
raspberrypi-firmware"

inherit rpm
