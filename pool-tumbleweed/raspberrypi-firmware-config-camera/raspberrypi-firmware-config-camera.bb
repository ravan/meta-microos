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

RPM_NAME = "raspberrypi-firmware-config-camera-2026.02.11-3.1.noarch.rpm"
RPM_HASH = "2bba3efb8fcea1a3d37f0d0038cde8984b10550e1d6fcceec5b9f1a851d43cf372a5c1040e34294ff90a12941a716a38704c2829f2054fba87917a3036f0084d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-raspberrypi-firmware-config-camera \
raspberrypi-firmware-branding-openSUSE \
raspberrypi-firmware-config \
raspberrypi-firmware-config-camera \
raspberrypi-firmware-config-rpi \
raspberrypi-firmware-config-rpi0w \
raspberrypi-firmware-config-rpi2 \
raspberrypi-firmware-config-rpi3"

RDEPENDS:${PN} += "/usr/bin/sh \
raspberrypi-firmware"

inherit rpm
