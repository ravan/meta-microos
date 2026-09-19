SUMMARY = "Cavium based arm64 systems"
DESCRIPTION = "Device Tree files for Cavium based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-cavium-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "ba4d50c29315e096cb4fdf68ff1742a7c0eba88a06f4c0eba0c795e09e57c0f9405c6d65882c8adc6068b3e294e86d67e65f439c61afba95a41f1308f1bc7b77"

RPROVIDES:${PN} += "dtb-cavium \
dtb-thunder-88xx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
